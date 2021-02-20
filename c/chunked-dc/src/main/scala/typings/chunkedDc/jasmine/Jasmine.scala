package typings.chunkedDc.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Jasmine extends StObject {
  
  var Spec: typings.chunkedDc.jasmine.Spec = js.native
  
  var clock: Clock = js.native
  
  var util: Util = js.native
}
object Jasmine {
  
  @scala.inline
  def apply(Spec: Spec, clock: Clock, util: Util): Jasmine = {
    val __obj = js.Dynamic.literal(Spec = Spec.asInstanceOf[js.Any], clock = clock.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jasmine]
  }
  
  @scala.inline
  implicit class JasmineMutableBuilder[Self <: Jasmine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClock(value: Clock): Self = StObject.set(x, "clock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: Spec): Self = StObject.set(x, "Spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtil(value: Util): Self = StObject.set(x, "util", value.asInstanceOf[js.Any])
  }
}
