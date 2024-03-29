package typings.cassanknex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateableIndexBuilder extends StObject {
  
  def withOptions(opts: MappedDict[String]): this.type
}
object CreateableIndexBuilder {
  
  inline def apply(withOptions: MappedDict[String] => CreateableIndexBuilder): CreateableIndexBuilder = {
    val __obj = js.Dynamic.literal(withOptions = js.Any.fromFunction1(withOptions))
    __obj.asInstanceOf[CreateableIndexBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateableIndexBuilder] (val x: Self) extends AnyVal {
    
    inline def setWithOptions(value: MappedDict[String] => CreateableIndexBuilder): Self = StObject.set(x, "withOptions", js.Any.fromFunction1(value))
  }
}
