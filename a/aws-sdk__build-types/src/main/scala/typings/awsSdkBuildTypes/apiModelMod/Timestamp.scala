package typings.awsSdkBuildTypes.apiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timestamp
  extends StObject
     with ShapeDef
     with Shape {
  
  var timestampFormat: js.UndefOr[java.lang.String] = js.undefined
  
  @JSName("type")
  val type_Timestamp: timestamp
}
object Timestamp {
  
  @scala.inline
  def apply(): Timestamp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("timestamp")
    __obj.asInstanceOf[Timestamp]
  }
  
  @scala.inline
  implicit class TimestampMutableBuilder[Self <: Timestamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimestampFormat(value: java.lang.String): Self = StObject.set(x, "timestampFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampFormatUndefined: Self = StObject.set(x, "timestampFormat", js.undefined)
    
    @scala.inline
    def setType(value: timestamp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
