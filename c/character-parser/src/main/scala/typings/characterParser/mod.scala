package typings.characterParser

import typings.characterParser.anon.End
import typings.characterParser.anon.IgnoreLineComment
import typings.characterParser.anon.IgnoreNesting
import typings.characterParser.anon.Src
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("character-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(src: String): State = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any]).asInstanceOf[State]
  inline def default(src: String, state: Unit, options: End): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def default(src: String, state: State): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def default(src: String, state: State, options: End): State = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[State]
  
  @JSImport("character-parser", "State")
  @js.native
  open class State () extends StObject {
    
    def current(): TOKEN_TYPES = js.native
    
    var escaped: Boolean = js.native
    
    var hasDollar: Boolean = js.native
    
    var history: String = js.native
    
    def isComment(): Boolean = js.native
    
    def isNesting(): Boolean = js.native
    def isNesting(opts: IgnoreLineComment): Boolean = js.native
    
    def isString(): Boolean = js.native
    
    var lastChar: String = js.native
    
    var regexpStart: Boolean = js.native
    
    var src: String = js.native
    
    var stack: js.Array[TOKEN_TYPES] = js.native
  }
  
  @js.native
  sealed trait TOKEN_TYPES extends StObject
  @JSImport("character-parser", "TOKEN_TYPES")
  @js.native
  object TOKEN_TYPES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TOKEN_TYPES & String] = js.native
    
    @js.native
    sealed trait BLOCK_COMMENT
      extends StObject
         with TOKEN_TYPES
    /* "BLOCK_COMMENT" */ val BLOCK_COMMENT: typings.characterParser.mod.TOKEN_TYPES.BLOCK_COMMENT & String = js.native
    
    @js.native
    sealed trait CURLY_BRACKET
      extends StObject
         with TOKEN_TYPES
    /* "CURLY_BRACKET" */ val CURLY_BRACKET: typings.characterParser.mod.TOKEN_TYPES.CURLY_BRACKET & String = js.native
    
    @js.native
    sealed trait DOUBLE_QUOTE
      extends StObject
         with TOKEN_TYPES
    /* "DOUBLE_QUOTE" */ val DOUBLE_QUOTE: typings.characterParser.mod.TOKEN_TYPES.DOUBLE_QUOTE & String = js.native
    
    @js.native
    sealed trait LINE_COMMENT
      extends StObject
         with TOKEN_TYPES
    /* "LINE_COMMENT" */ val LINE_COMMENT: typings.characterParser.mod.TOKEN_TYPES.LINE_COMMENT & String = js.native
    
    @js.native
    sealed trait REGEXP
      extends StObject
         with TOKEN_TYPES
    /* "REGEXP" */ val REGEXP: typings.characterParser.mod.TOKEN_TYPES.REGEXP & String = js.native
    
    @js.native
    sealed trait ROUND_BRACKET
      extends StObject
         with TOKEN_TYPES
    /* "ROUND_BRACKET" */ val ROUND_BRACKET: typings.characterParser.mod.TOKEN_TYPES.ROUND_BRACKET & String = js.native
    
    @js.native
    sealed trait SINGLE_QUOTE
      extends StObject
         with TOKEN_TYPES
    /* "SINGLE_QUOTE" */ val SINGLE_QUOTE: typings.characterParser.mod.TOKEN_TYPES.SINGLE_QUOTE & String = js.native
    
    @js.native
    sealed trait SQUARE_BRACKET
      extends StObject
         with TOKEN_TYPES
    /* "SQUARE_BRACKET" */ val SQUARE_BRACKET: typings.characterParser.mod.TOKEN_TYPES.SQUARE_BRACKET & String = js.native
    
    @js.native
    sealed trait TEMPLATE_QUOTE
      extends StObject
         with TOKEN_TYPES
    /* "TEMPLATE_QUOTE" */ val TEMPLATE_QUOTE: typings.characterParser.mod.TOKEN_TYPES.TEMPLATE_QUOTE & String = js.native
  }
  
  inline def defaultState(): State = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultState")().asInstanceOf[State]
  
  inline def isKeyword(id: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeyword")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPunctuator(c: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPunctuator")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parse(src: String): State = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any]).asInstanceOf[State]
  inline def parse(src: String, state: Unit, options: End): State = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def parse(src: String, state: State): State = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def parse(src: String, state: State, options: End): State = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[State]
  
  inline def parseChar(character: String): State = ^.asInstanceOf[js.Dynamic].applyDynamic("parseChar")(character.asInstanceOf[js.Any]).asInstanceOf[State]
  inline def parseChar(character: String, state: State): State = (^.asInstanceOf[js.Dynamic].applyDynamic("parseChar")(character.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[State]
  
  inline def parseUntil(src: String, delimiter: String): Src = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUntil")(src.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[Src]
  inline def parseUntil(src: String, delimiter: String, options: IgnoreNesting): Src = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUntil")(src.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Src]
  inline def parseUntil(src: String, delimiter: js.RegExp): Src = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUntil")(src.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[Src]
  inline def parseUntil(src: String, delimiter: js.RegExp, options: IgnoreNesting): Src = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUntil")(src.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Src]
}
