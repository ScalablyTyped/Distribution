package typings.cborg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibLengthMod {
  
  @JSImport("cborg/types/lib/length", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encodedLength(data: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodedLength")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def encodedLength(data: Any, options: typings.cborg.typesInterfaceMod.EncodeOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("encodedLength")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def tokensToLength(tokens: TokenOrNestedTokens): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tokensToLength")(tokens.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def tokensToLength(tokens: TokenOrNestedTokens, encoders: js.Array[typings.cborg.typesInterfaceMod.TokenTypeEncoder]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToLength")(tokens.asInstanceOf[js.Any], encoders.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def tokensToLength(
    tokens: TokenOrNestedTokens,
    encoders: js.Array[typings.cborg.typesInterfaceMod.TokenTypeEncoder],
    options: typings.cborg.typesInterfaceMod.EncodeOptions
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToLength")(tokens.asInstanceOf[js.Any], encoders.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def tokensToLength(
    tokens: TokenOrNestedTokens,
    encoders: Unit,
    options: typings.cborg.typesInterfaceMod.EncodeOptions
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToLength")(tokens.asInstanceOf[js.Any], encoders.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  type EncodeOptions = typings.cborg.typesInterfaceMod.EncodeOptions
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped cborg.cborg/types/lib/token.Token | std.Array<cborg.cborg/types/lib/token.Token> | std.Array<any> */ trait TokenOrNestedTokens extends StObject
  
  type TokenTypeEncoder = typings.cborg.typesInterfaceMod.TokenTypeEncoder
}
