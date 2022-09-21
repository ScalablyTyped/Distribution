package typings.chrome.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.chrome.chrome.declarativeContent.PageChangedEvent
import typings.chrome.chrome.declarativeContent.PageStateMatcher
import typings.chrome.chrome.declarativeContent.PageStateMatcherProperties
import typings.chrome.chrome.declarativeContent.SetIcon
import typings.chrome.chrome.declarativeContent.ShowAction
import typings.chrome.chrome.declarativeContent.ShowPageAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofdeclarativeContent extends StObject {
  
  var PageStateMatcher: Instantiable1[
    /* options */ PageStateMatcherProperties, 
    typings.chrome.chrome.declarativeContent.PageStateMatcher
  ]
  
  var PageStateMatcherProperties: Instantiable0[typings.chrome.chrome.declarativeContent.PageStateMatcherProperties]
  
  var SetIcon: Instantiable1[
    /* options */ js.UndefOr[ImageData], 
    typings.chrome.chrome.declarativeContent.SetIcon
  ]
  
  var ShowAction: Instantiable0[typings.chrome.chrome.declarativeContent.ShowAction]
  
  var ShowPageAction: Instantiable0[typings.chrome.chrome.declarativeContent.ShowPageAction]
  
  var onPageChanged: PageChangedEvent
}
object TypeofdeclarativeContent {
  
  inline def apply(
    PageStateMatcher: Instantiable1[/* options */ PageStateMatcherProperties, PageStateMatcher],
    PageStateMatcherProperties: Instantiable0[PageStateMatcherProperties],
    SetIcon: Instantiable1[/* options */ js.UndefOr[ImageData], SetIcon],
    ShowAction: Instantiable0[ShowAction],
    ShowPageAction: Instantiable0[ShowPageAction],
    onPageChanged: PageChangedEvent
  ): TypeofdeclarativeContent = {
    val __obj = js.Dynamic.literal(PageStateMatcher = PageStateMatcher.asInstanceOf[js.Any], PageStateMatcherProperties = PageStateMatcherProperties.asInstanceOf[js.Any], SetIcon = SetIcon.asInstanceOf[js.Any], ShowAction = ShowAction.asInstanceOf[js.Any], ShowPageAction = ShowPageAction.asInstanceOf[js.Any], onPageChanged = onPageChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofdeclarativeContent]
  }
  
  extension [Self <: TypeofdeclarativeContent](x: Self) {
    
    inline def setOnPageChanged(value: PageChangedEvent): Self = StObject.set(x, "onPageChanged", value.asInstanceOf[js.Any])
    
    inline def setPageStateMatcher(value: Instantiable1[/* options */ PageStateMatcherProperties, PageStateMatcher]): Self = StObject.set(x, "PageStateMatcher", value.asInstanceOf[js.Any])
    
    inline def setPageStateMatcherProperties(value: Instantiable0[PageStateMatcherProperties]): Self = StObject.set(x, "PageStateMatcherProperties", value.asInstanceOf[js.Any])
    
    inline def setSetIcon(value: Instantiable1[/* options */ js.UndefOr[ImageData], SetIcon]): Self = StObject.set(x, "SetIcon", value.asInstanceOf[js.Any])
    
    inline def setShowAction(value: Instantiable0[ShowAction]): Self = StObject.set(x, "ShowAction", value.asInstanceOf[js.Any])
    
    inline def setShowPageAction(value: Instantiable0[ShowPageAction]): Self = StObject.set(x, "ShowPageAction", value.asInstanceOf[js.Any])
  }
}
