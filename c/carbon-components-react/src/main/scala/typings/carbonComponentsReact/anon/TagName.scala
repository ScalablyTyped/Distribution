package typings.carbonComponentsReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagName[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.carbonComponentsReact.carbonComponentsReactStrings.a, typings.carbonComponentsReact.carbonComponentsReactStrings.abbr, typings.carbonComponentsReact.carbonComponentsReactStrings.address */ Any */] extends StObject {
  
  var tagName: K
}
object TagName {
  
  inline def apply[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.carbonComponentsReact.carbonComponentsReactStrings.a, typings.carbonComponentsReact.carbonComponentsReactStrings.abbr, typings.carbonComponentsReact.carbonComponentsReactStrings.address */ Any */](tagName: K): TagName[K] = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagName[K]]
  }
  
  extension [Self <: TagName[?], K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.carbonComponentsReact.carbonComponentsReactStrings.a, typings.carbonComponentsReact.carbonComponentsReactStrings.abbr, typings.carbonComponentsReact.carbonComponentsReactStrings.address */ Any */](x: Self & TagName[K]) {
    
    inline def setTagName(value: K): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
  }
}
