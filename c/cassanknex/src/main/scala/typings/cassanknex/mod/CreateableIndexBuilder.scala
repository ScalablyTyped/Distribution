package typings.cassanknex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateableIndexBuilder extends StObject {
  
  def withOptions(opts: MappedDict[String]): this.type = js.native
}
object CreateableIndexBuilder {
  
  @scala.inline
  def apply(withOptions: MappedDict[String] => CreateableIndexBuilder): CreateableIndexBuilder = {
    val __obj = js.Dynamic.literal(withOptions = js.Any.fromFunction1(withOptions))
    __obj.asInstanceOf[CreateableIndexBuilder]
  }
  
  @scala.inline
  implicit class CreateableIndexBuilderMutableBuilder[Self <: CreateableIndexBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWithOptions(value: MappedDict[String] => CreateableIndexBuilder): Self = StObject.set(x, "withOptions", js.Any.fromFunction1(value))
  }
}
