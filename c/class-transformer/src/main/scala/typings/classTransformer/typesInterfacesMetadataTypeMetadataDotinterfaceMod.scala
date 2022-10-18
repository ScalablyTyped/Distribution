package typings.classTransformer

import typings.classTransformer.typesInterfacesDecoratorOptionsTypeOptionsDotinterfaceMod.TypeOptions
import typings.classTransformer.typesInterfacesTypeHelpOptionsDotinterfaceMod.TypeHelpOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInterfacesMetadataTypeMetadataDotinterfaceMod {
  
  @js.native
  trait TypeMetadata extends StObject {
    
    /**
      * Options passed to the @Type operator for this property.
      */
    var options: TypeOptions = js.native
    
    /**
      * The property name this metadata belongs to on the target (property only).
      */
    var propertyName: String = js.native
    
    /**
      * The type guessed from assigned Reflect metadata ('design:type')
      */
    var reflectedType: Any = js.native
    
    var target: js.Function = js.native
    
    /**
      * The custom function provided by the user in the @Type decorator which
      * returns the target type for the transformation.
      */
    def typeFunction(): js.Function = js.native
    def typeFunction(options: TypeHelpOptions): js.Function = js.native
  }
}
