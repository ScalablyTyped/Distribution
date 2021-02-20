package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Classname extends StObject {
  
  /** Class to assign to the chart's container SVG element. */
  var classname: js.UndefOr[String] = js.native
}
object Classname {
  
  @scala.inline
  def apply(): Classname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Classname]
  }
  
  @scala.inline
  implicit class ClassnameMutableBuilder[Self <: Classname] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassname(value: String): Self = StObject.set(x, "classname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassnameUndefined: Self = StObject.set(x, "classname", js.undefined)
  }
}
