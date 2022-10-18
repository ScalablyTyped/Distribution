package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFilter extends StObject {
  
  /**
    *  Specifies the tag that must be associated with the execution for it to meet the filter criteria. Tags may only contain unicode letters, digits, whitespace, or these symbols: _ . : / = + - @.
    */
  var tag: Tag
}
object TagFilter {
  
  inline def apply(tag: Tag): TagFilter = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFilter]
  }
  
  extension [Self <: TagFilter](x: Self) {
    
    inline def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
