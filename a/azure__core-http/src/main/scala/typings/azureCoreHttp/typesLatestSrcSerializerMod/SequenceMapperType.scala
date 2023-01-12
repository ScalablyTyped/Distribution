package typings.azureCoreHttp.typesLatestSrcSerializerMod

import typings.azureCoreHttp.azureCoreHttpStrings.Sequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequenceMapperType
  extends StObject
     with MapperType {
  
  /**
    * The mapper to use to map each one of the properties of the sequence.
    */
  var element: Mapper
  
  /**
    * Name of the sequence type mapper.
    */
  var name: Sequence
}
object SequenceMapperType {
  
  inline def apply(element: Mapper): SequenceMapperType = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = "Sequence")
    __obj.asInstanceOf[SequenceMapperType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SequenceMapperType] (val x: Self) extends AnyVal {
    
    inline def setElement(value: Mapper): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setName(value: Sequence): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
