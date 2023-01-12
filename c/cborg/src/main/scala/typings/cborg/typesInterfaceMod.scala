package typings.cborg

import org.scalablytyped.runtime.StringDictionary
import typings.cborg.typesLibBlMod.Bl
import typings.cborg.typesLibTokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInterfaceMod {
  
  trait DecodeOptions extends StObject {
    
    var allowBigInt: js.UndefOr[Boolean] = js.undefined
    
    var allowIndefinite: js.UndefOr[Boolean] = js.undefined
    
    var allowInfinity: js.UndefOr[Boolean] = js.undefined
    
    var allowNaN: js.UndefOr[Boolean] = js.undefined
    
    var allowUndefined: js.UndefOr[Boolean] = js.undefined
    
    var coerceUndefinedToNull: js.UndefOr[Boolean] = js.undefined
    
    var retainStringBytes: js.UndefOr[Boolean] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
    
    var tags: js.UndefOr[js.Array[TagDecoder]] = js.undefined
    
    var tokenizer: js.UndefOr[DecodeTokenizer] = js.undefined
    
    var useMaps: js.UndefOr[Boolean] = js.undefined
  }
  object DecodeOptions {
    
    inline def apply(): DecodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecodeOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowBigInt(value: Boolean): Self = StObject.set(x, "allowBigInt", value.asInstanceOf[js.Any])
      
      inline def setAllowBigIntUndefined: Self = StObject.set(x, "allowBigInt", js.undefined)
      
      inline def setAllowIndefinite(value: Boolean): Self = StObject.set(x, "allowIndefinite", value.asInstanceOf[js.Any])
      
      inline def setAllowIndefiniteUndefined: Self = StObject.set(x, "allowIndefinite", js.undefined)
      
      inline def setAllowInfinity(value: Boolean): Self = StObject.set(x, "allowInfinity", value.asInstanceOf[js.Any])
      
      inline def setAllowInfinityUndefined: Self = StObject.set(x, "allowInfinity", js.undefined)
      
      inline def setAllowNaN(value: Boolean): Self = StObject.set(x, "allowNaN", value.asInstanceOf[js.Any])
      
      inline def setAllowNaNUndefined: Self = StObject.set(x, "allowNaN", js.undefined)
      
      inline def setAllowUndefined(value: Boolean): Self = StObject.set(x, "allowUndefined", value.asInstanceOf[js.Any])
      
      inline def setAllowUndefinedUndefined: Self = StObject.set(x, "allowUndefined", js.undefined)
      
      inline def setCoerceUndefinedToNull(value: Boolean): Self = StObject.set(x, "coerceUndefinedToNull", value.asInstanceOf[js.Any])
      
      inline def setCoerceUndefinedToNullUndefined: Self = StObject.set(x, "coerceUndefinedToNull", js.undefined)
      
      inline def setRetainStringBytes(value: Boolean): Self = StObject.set(x, "retainStringBytes", value.asInstanceOf[js.Any])
      
      inline def setRetainStringBytesUndefined: Self = StObject.set(x, "retainStringBytes", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setTags(value: js.Array[TagDecoder]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: TagDecoder*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setTokenizer(value: DecodeTokenizer): Self = StObject.set(x, "tokenizer", value.asInstanceOf[js.Any])
      
      inline def setTokenizerUndefined: Self = StObject.set(x, "tokenizer", js.undefined)
      
      inline def setUseMaps(value: Boolean): Self = StObject.set(x, "useMaps", value.asInstanceOf[js.Any])
      
      inline def setUseMapsUndefined: Self = StObject.set(x, "useMaps", js.undefined)
    }
  }
  
  trait DecodeTokenizer extends StObject {
    
    def done(): Boolean
    
    def next(): Token
  }
  object DecodeTokenizer {
    
    inline def apply(done: () => Boolean, next: () => Token): DecodeTokenizer = {
      val __obj = js.Dynamic.literal(done = js.Any.fromFunction0(done), next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[DecodeTokenizer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecodeTokenizer] (val x: Self) extends AnyVal {
      
      inline def setDone(value: () => Boolean): Self = StObject.set(x, "done", js.Any.fromFunction0(value))
      
      inline def setNext(value: () => Token): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
  
  trait EncodeOptions extends StObject {
    
    var addBreakTokens: js.UndefOr[Boolean] = js.undefined
    
    var float64: js.UndefOr[Boolean] = js.undefined
    
    var mapSorter: js.UndefOr[MapSorter] = js.undefined
    
    var quickEncodeToken: js.UndefOr[QuickEncodeToken] = js.undefined
    
    var typeEncoders: js.UndefOr[StringDictionary[OptionalTypeEncoder]] = js.undefined
  }
  object EncodeOptions {
    
    inline def apply(): EncodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncodeOptions] (val x: Self) extends AnyVal {
      
      inline def setAddBreakTokens(value: Boolean): Self = StObject.set(x, "addBreakTokens", value.asInstanceOf[js.Any])
      
      inline def setAddBreakTokensUndefined: Self = StObject.set(x, "addBreakTokens", js.undefined)
      
      inline def setFloat64(value: Boolean): Self = StObject.set(x, "float64", value.asInstanceOf[js.Any])
      
      inline def setFloat64Undefined: Self = StObject.set(x, "float64", js.undefined)
      
      inline def setMapSorter(
        value: (/* e1 */ js.Array[Token | js.Array[Token]], /* e2 */ js.Array[Token | js.Array[Token]]) => Double
      ): Self = StObject.set(x, "mapSorter", js.Any.fromFunction2(value))
      
      inline def setMapSorterUndefined: Self = StObject.set(x, "mapSorter", js.undefined)
      
      inline def setQuickEncodeToken(value: /* token */ Token => js.UndefOr[js.typedarray.Uint8Array]): Self = StObject.set(x, "quickEncodeToken", js.Any.fromFunction1(value))
      
      inline def setQuickEncodeTokenUndefined: Self = StObject.set(x, "quickEncodeToken", js.undefined)
      
      inline def setTypeEncoders(value: StringDictionary[OptionalTypeEncoder]): Self = StObject.set(x, "typeEncoders", value.asInstanceOf[js.Any])
      
      inline def setTypeEncodersUndefined: Self = StObject.set(x, "typeEncoders", js.undefined)
    }
  }
  
  type MapSorter = js.Function2[
    /* e1 */ js.Array[Token | js.Array[Token]], 
    /* e2 */ js.Array[Token | js.Array[Token]], 
    Double
  ]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type OptionalTypeEncoder = (data : any, typ : string, options : cborg.cborg/types/interface.EncodeOptions, refStack : cborg.cborg/types/interface.Reference | undefined): cborg.cborg/types/interface.TokenOrNestedTokens | null
  }}}
  to avoid circular code involving: 
  - cborg.cborg/types/cborg.TypeEncoder
  - cborg.cborg/types/interface.OptionalTypeEncoder
  - cborg.cborg/types/interface.TokenOrNestedTokens
  - cborg.cborg/types/lib/encode.OptionalTypeEncoder
  */
  @js.native
  trait OptionalTypeEncoder extends StObject {
    
    def apply(data: Any, typ: String, options: EncodeOptions): TokenOrNestedTokens | Null = js.native
    def apply(data: Any, typ: String, options: EncodeOptions, refStack: Reference): TokenOrNestedTokens | Null = js.native
  }
  
  type QuickEncodeToken = js.Function1[/* token */ Token, js.UndefOr[js.typedarray.Uint8Array]]
  
  @js.native
  trait Reference extends StObject {
    
    def includes(obj: js.Array[Any]): Boolean = js.native
    def includes(obj: js.Object): Boolean = js.native
    
    var obj: js.Object | js.Array[Any] = js.native
    
    var parent: js.UndefOr[Reference] = js.native
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type StrictTypeEncoder = (data : any, typ : string, options : cborg.cborg/types/interface.EncodeOptions, refStack : cborg.cborg/types/interface.Reference | undefined): cborg.cborg/types/interface.TokenOrNestedTokens
  }}}
  to avoid circular code involving: 
  - cborg.cborg/types/interface.StrictTypeEncoder
  - cborg.cborg/types/interface.TokenOrNestedTokens
  */
  @js.native
  trait StrictTypeEncoder extends StObject {
    
    def apply(data: Any, typ: String, options: EncodeOptions): TokenOrNestedTokens = js.native
    def apply(data: Any, typ: String, options: EncodeOptions, refStack: Reference): TokenOrNestedTokens = js.native
  }
  
  type TagDecoder = js.Function1[/* inner */ Any, Any]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type TokenOrNestedTokens = cborg.cborg/types/lib/token.Token | std.Array<cborg.cborg/types/lib/token.Token> | std.Array<cborg.cborg/types/interface.TokenOrNestedTokens>
  }}}
  to avoid circular code involving: 
  - cborg.cborg/types/interface.TokenOrNestedTokens
  */
  type TokenOrNestedTokens = Token | (js.Array[Any | Token])
  
  @js.native
  trait TokenTypeEncoder extends StObject {
    
    def apply(buf: Bl, token: Token): Unit = js.native
    def apply(buf: Bl, token: Token, options: EncodeOptions): Unit = js.native
    
    def compareTokens(t1: Token, t2: Token): Double = js.native
    
    var encodedSize: js.UndefOr[js.Function2[/* token */ Token, /* options */ js.UndefOr[EncodeOptions], Double]] = js.native
  }
}
