package typings.cborg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibEncodeMod {
  
  @JSImport("cborg/types/lib/encode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cborg/types/lib/encode", "Ref")
  @js.native
  open class Ref protected ()
    extends StObject
       with typings.cborg.typesInterfaceMod.Reference {
    def this(obj: js.Array[Any]) = this()
    /**
      * @param {object|any[]} obj
      * @param {Reference|undefined} parent
      */
    def this(obj: js.Object) = this()
    def this(obj: js.Array[Any], parent: Reference) = this()
    def this(obj: js.Object, parent: Reference) = this()
  }
  /* static members */
  object Ref {
    
    @JSImport("cborg/types/lib/encode", "Ref")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createCheck(stack: Unit, obj: js.Array[Any]): Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("createCheck")(stack.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Reference]
    inline def createCheck(stack: Unit, obj: js.Object): Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("createCheck")(stack.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Reference]
    inline def createCheck(stack: Reference, obj: js.Array[Any]): Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("createCheck")(stack.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Reference]
    /**
      * @param {Reference|undefined} stack
      * @param {object|any[]} obj
      * @returns {Reference}
      */
    inline def createCheck(stack: Reference, obj: js.Object): Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("createCheck")(stack.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Reference]
  }
  
  inline def encode(data: Any): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def encode(data: Any, options: typings.cborg.typesInterfaceMod.EncodeOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encodeCustom(data: Any, encoders: js.Array[TokenTypeEncoder], options: EncodeOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeCustom")(data.asInstanceOf[js.Any], encoders.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def makeCborEncoders(): js.Array[TokenTypeEncoder] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeCborEncoders")().asInstanceOf[js.Array[TokenTypeEncoder]]
  
  inline def objectToTokens(obj: Any): TokenOrNestedTokens = ^.asInstanceOf[js.Dynamic].applyDynamic("objectToTokens")(obj.asInstanceOf[js.Any]).asInstanceOf[TokenOrNestedTokens]
  inline def objectToTokens(obj: Any, options: Unit, refStack: typings.cborg.typesInterfaceMod.Reference): TokenOrNestedTokens = (^.asInstanceOf[js.Dynamic].applyDynamic("objectToTokens")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any], refStack.asInstanceOf[js.Any])).asInstanceOf[TokenOrNestedTokens]
  inline def objectToTokens(obj: Any, options: typings.cborg.typesInterfaceMod.EncodeOptions): TokenOrNestedTokens = (^.asInstanceOf[js.Dynamic].applyDynamic("objectToTokens")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TokenOrNestedTokens]
  inline def objectToTokens(
    obj: Any,
    options: typings.cborg.typesInterfaceMod.EncodeOptions,
    refStack: typings.cborg.typesInterfaceMod.Reference
  ): TokenOrNestedTokens = (^.asInstanceOf[js.Dynamic].applyDynamic("objectToTokens")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any], refStack.asInstanceOf[js.Any])).asInstanceOf[TokenOrNestedTokens]
  
  type EncodeOptions = typings.cborg.typesInterfaceMod.EncodeOptions
  
  type OptionalTypeEncoder = typings.cborg.typesInterfaceMod.OptionalTypeEncoder
  
  type Reference = typings.cborg.typesInterfaceMod.Reference
  
  @js.native
  trait StrictTypeEncoder
    extends StObject
       with typings.cborg.typesInterfaceMod.StrictTypeEncoder
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped cborg.cborg/types/lib/token.Token | std.Array<cborg.cborg/types/lib/token.Token> | std.Array<any> */ trait TokenOrNestedTokens extends StObject
  
  type TokenTypeEncoder = typings.cborg.typesInterfaceMod.TokenTypeEncoder
}
