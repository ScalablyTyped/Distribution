package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputFormatConfiguration extends StObject {
  
  /**
    * Specifies which serializer to use. You can choose either the ORC SerDe or the Parquet SerDe. If both are non-null, the server rejects the request.
    */
  var Serializer: js.UndefOr[typings.awsSdk.firehoseMod.Serializer] = js.undefined
}
object OutputFormatConfiguration {
  
  @scala.inline
  def apply(): OutputFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputFormatConfiguration]
  }
  
  @scala.inline
  implicit class OutputFormatConfigurationMutableBuilder[Self <: OutputFormatConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSerializer(value: Serializer): Self = StObject.set(x, "Serializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializerUndefined: Self = StObject.set(x, "Serializer", js.undefined)
  }
}
