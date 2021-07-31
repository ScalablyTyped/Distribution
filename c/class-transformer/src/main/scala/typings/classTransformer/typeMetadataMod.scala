package typings.classTransformer

import typings.classTransformer.exposeExcludeOptionsMod.TypeHelpOptions
import typings.classTransformer.exposeExcludeOptionsMod.TypeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeMetadataMod {
  
  @JSImport("class-transformer/metadata/TypeMetadata", "TypeMetadata")
  @js.native
  class TypeMetadata protected () extends StObject {
    def this(
      target: js.Function,
      propertyName: String,
      reflectedType: js.Any,
      typeFunction: js.Function1[/* options */ js.UndefOr[TypeHelpOptions], js.Function],
      options: TypeOptions
    ) = this()
    
    var options: TypeOptions = js.native
    
    var propertyName: String = js.native
    
    var reflectedType: js.Any = js.native
    
    var target: js.Function = js.native
    
    def typeFunction(): js.Function = js.native
    def typeFunction(options: TypeHelpOptions): js.Function = js.native
  }
}
