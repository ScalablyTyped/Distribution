package typings.contentfulManagement.anon

import typings.contentfulManagement.commonTypesMod.MetaLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sys extends StObject {
  
  var sys: MetaLinkProps
}
object Sys {
  
  @scala.inline
  def apply(sys: MetaLinkProps): Sys = {
    val __obj = js.Dynamic.literal(sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sys]
  }
  
  @scala.inline
  implicit class SysMutableBuilder[Self <: Sys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSys(value: MetaLinkProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
  }
}
