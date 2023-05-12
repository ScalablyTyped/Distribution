package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alarm extends StObject {
  
  /**
    * The name of your CloudWatch alarm.
    */
  var Name: AlarmName
}
object Alarm {
  
  inline def apply(Name: AlarmName): Alarm = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alarm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alarm] (val x: Self) extends AnyVal {
    
    inline def setName(value: AlarmName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
