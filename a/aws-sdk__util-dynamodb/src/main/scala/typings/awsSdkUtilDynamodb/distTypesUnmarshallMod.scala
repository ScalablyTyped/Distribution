package typings.awsSdkUtilDynamodb

import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue
import typings.awsSdkUtilDynamodb.distTypesModelsMod.NativeAttributeValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUnmarshallMod {
  
  @JSImport("@aws-sdk/util-dynamodb/dist-types/unmarshall", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unmarshall(data: Record[String, AttributeValue]): Record[String, NativeAttributeValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("unmarshall")(data.asInstanceOf[js.Any]).asInstanceOf[Record[String, NativeAttributeValue]]
  inline def unmarshall(data: Record[String, AttributeValue], options: unmarshallOptions): Record[String, NativeAttributeValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("unmarshall")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, NativeAttributeValue]]
  
  trait unmarshallOptions extends StObject {
    
    /**
      * Whether to return numbers as a string instead of converting them to native JavaScript numbers.
      * This allows for the safe round-trip transport of numbers of arbitrary size.
      */
    var wrapNumbers: js.UndefOr[Boolean] = js.undefined
  }
  object unmarshallOptions {
    
    inline def apply(): unmarshallOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[unmarshallOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: unmarshallOptions] (val x: Self) extends AnyVal {
      
      inline def setWrapNumbers(value: Boolean): Self = StObject.set(x, "wrapNumbers", value.asInstanceOf[js.Any])
      
      inline def setWrapNumbersUndefined: Self = StObject.set(x, "wrapNumbers", js.undefined)
    }
  }
}
