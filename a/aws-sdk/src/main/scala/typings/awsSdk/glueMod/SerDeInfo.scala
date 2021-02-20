package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerDeInfo extends StObject {
  
  /**
    * Name of the SerDe.
    */
  var Name: js.UndefOr[NameString] = js.native
  
  /**
    * These key-value pairs define initialization parameters for the SerDe.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  
  /**
    * Usually the class that implements the SerDe. An example is org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe.
    */
  var SerializationLibrary: js.UndefOr[NameString] = js.native
}
object SerDeInfo {
  
  @scala.inline
  def apply(): SerDeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerDeInfo]
  }
  
  @scala.inline
  implicit class SerDeInfoMutableBuilder[Self <: SerDeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setParameters(value: ParametersMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setSerializationLibrary(value: NameString): Self = StObject.set(x, "SerializationLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializationLibraryUndefined: Self = StObject.set(x, "SerializationLibrary", js.undefined)
  }
}
