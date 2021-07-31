package typings.datatablesNetButtons.DataTables

import typings.datatablesNet.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtButtonsCollectionSettings extends StObject {
  
  def action(e: js.Any, dt: Api, node: JQuery, config: ButtonSettings): Unit
  @JSName("action")
  var action_Original: FunctionButtonAction
  
  var autoClose: Boolean
  
  var background: Boolean
  
  var backgroundClassName: String
  
  var className: String
  
  var collectionLayout: String
  
  var fade: Double
  
  def text(a: js.Any): String
  @JSName("text")
  var text_Original: FunctionExtButtonsCollectionText
}
object ExtButtonsCollectionSettings {
  
  @scala.inline
  def apply(
    action: (/* e */ js.Any, /* dt */ Api, /* node */ JQuery, /* config */ ButtonSettings) => Unit,
    autoClose: Boolean,
    background: Boolean,
    backgroundClassName: String,
    className: String,
    collectionLayout: String,
    fade: Double,
    text: /* a */ js.Any => String
  ): ExtButtonsCollectionSettings = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction4(action), autoClose = autoClose.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], backgroundClassName = backgroundClassName.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], collectionLayout = collectionLayout.asInstanceOf[js.Any], fade = fade.asInstanceOf[js.Any], text = js.Any.fromFunction1(text))
    __obj.asInstanceOf[ExtButtonsCollectionSettings]
  }
  
  @scala.inline
  implicit class ExtButtonsCollectionSettingsMutableBuilder[Self <: ExtButtonsCollectionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: (/* e */ js.Any, /* dt */ Api, /* node */ JQuery, /* config */ ButtonSettings) => Unit): Self = StObject.set(x, "action", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundClassName(value: String): Self = StObject.set(x, "backgroundClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionLayout(value: String): Self = StObject.set(x, "collectionLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFade(value: Double): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: /* a */ js.Any => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
  }
}
