package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LexerDefinitionErrorType extends StObject
@JSImport("@chevrotain/types", "LexerDefinitionErrorType")
@js.native
object LexerDefinitionErrorType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LexerDefinitionErrorType & Double] = js.native
  
  @js.native
  sealed trait CUSTOM_LINE_BREAK
    extends StObject
       with LexerDefinitionErrorType
  /* 16 */ val CUSTOM_LINE_BREAK: typings.chevrotainTypes.mod.LexerDefinitionErrorType.CUSTOM_LINE_BREAK & Double = js.native
  
  @js.native
  sealed trait DUPLICATE_PATTERNS_FOUND
    extends StObject
       with LexerDefinitionErrorType
  /* 4 */ val DUPLICATE_PATTERNS_FOUND: typings.chevrotainTypes.mod.LexerDefinitionErrorType.DUPLICATE_PATTERNS_FOUND & Double = js.native
  
  @js.native
  sealed trait EMPTY_MATCH_PATTERN
    extends StObject
       with LexerDefinitionErrorType
  /* 12 */ val EMPTY_MATCH_PATTERN: typings.chevrotainTypes.mod.LexerDefinitionErrorType.EMPTY_MATCH_PATTERN & Double = js.native
  
  @js.native
  sealed trait EOI_ANCHOR_FOUND
    extends StObject
       with LexerDefinitionErrorType
  /* 2 */ val EOI_ANCHOR_FOUND: typings.chevrotainTypes.mod.LexerDefinitionErrorType.EOI_ANCHOR_FOUND & Double = js.native
  
  @js.native
  sealed trait IDENTIFY_TERMINATOR
    extends StObject
       with LexerDefinitionErrorType
  /* 15 */ val IDENTIFY_TERMINATOR: typings.chevrotainTypes.mod.LexerDefinitionErrorType.IDENTIFY_TERMINATOR & Double = js.native
  
  @js.native
  sealed trait INVALID_GROUP_TYPE_FOUND
    extends StObject
       with LexerDefinitionErrorType
  /* 5 */ val INVALID_GROUP_TYPE_FOUND: typings.chevrotainTypes.mod.LexerDefinitionErrorType.INVALID_GROUP_TYPE_FOUND & Double = js.native
  
  @js.native
  sealed trait INVALID_PATTERN
    extends StObject
       with LexerDefinitionErrorType
  /* 1 */ val INVALID_PATTERN: typings.chevrotainTypes.mod.LexerDefinitionErrorType.INVALID_PATTERN & Double = js.native
  
  @js.native
  sealed trait LEXER_DEFINITION_CANNOT_CONTAIN_UNDEFINED
    extends StObject
       with LexerDefinitionErrorType
  /* 10 */ val LEXER_DEFINITION_CANNOT_CONTAIN_UNDEFINED: typings.chevrotainTypes.mod.LexerDefinitionErrorType.LEXER_DEFINITION_CANNOT_CONTAIN_UNDEFINED & Double = js.native
  
  @js.native
  sealed trait MISSING_PATTERN
    extends StObject
       with LexerDefinitionErrorType
  /* 0 */ val MISSING_PATTERN: typings.chevrotainTypes.mod.LexerDefinitionErrorType.MISSING_PATTERN & Double = js.native
  
  @js.native
  sealed trait MULTI_MODE_LEXER_DEFAULT_MODE_VALUE_DOES_NOT_EXIST
    extends StObject
       with LexerDefinitionErrorType
  /* 9 */ val MULTI_MODE_LEXER_DEFAULT_MODE_VALUE_DOES_NOT_EXIST: typings.chevrotainTypes.mod.LexerDefinitionErrorType.MULTI_MODE_LEXER_DEFAULT_MODE_VALUE_DOES_NOT_EXIST & Double = js.native
  
  @js.native
  sealed trait MULTI_MODE_LEXER_LONGER_ALT_NOT_IN_CURRENT_MODE
    extends StObject
       with LexerDefinitionErrorType
  /* 17 */ val MULTI_MODE_LEXER_LONGER_ALT_NOT_IN_CURRENT_MODE: typings.chevrotainTypes.mod.LexerDefinitionErrorType.MULTI_MODE_LEXER_LONGER_ALT_NOT_IN_CURRENT_MODE & Double = js.native
  
  @js.native
  sealed trait MULTI_MODE_LEXER_WITHOUT_DEFAULT_MODE
    extends StObject
       with LexerDefinitionErrorType
  /* 7 */ val MULTI_MODE_LEXER_WITHOUT_DEFAULT_MODE: typings.chevrotainTypes.mod.LexerDefinitionErrorType.MULTI_MODE_LEXER_WITHOUT_DEFAULT_MODE & Double = js.native
  
  @js.native
  sealed trait MULTI_MODE_LEXER_WITHOUT_MODES_PROPERTY
    extends StObject
       with LexerDefinitionErrorType
  /* 8 */ val MULTI_MODE_LEXER_WITHOUT_MODES_PROPERTY: typings.chevrotainTypes.mod.LexerDefinitionErrorType.MULTI_MODE_LEXER_WITHOUT_MODES_PROPERTY & Double = js.native
  
  @js.native
  sealed trait NO_LINE_BREAKS_FLAGS
    extends StObject
       with LexerDefinitionErrorType
  /* 13 */ val NO_LINE_BREAKS_FLAGS: typings.chevrotainTypes.mod.LexerDefinitionErrorType.NO_LINE_BREAKS_FLAGS & Double = js.native
  
  @js.native
  sealed trait PUSH_MODE_DOES_NOT_EXIST
    extends StObject
       with LexerDefinitionErrorType
  /* 6 */ val PUSH_MODE_DOES_NOT_EXIST: typings.chevrotainTypes.mod.LexerDefinitionErrorType.PUSH_MODE_DOES_NOT_EXIST & Double = js.native
  
  @js.native
  sealed trait SOI_ANCHOR_FOUND
    extends StObject
       with LexerDefinitionErrorType
  /* 11 */ val SOI_ANCHOR_FOUND: typings.chevrotainTypes.mod.LexerDefinitionErrorType.SOI_ANCHOR_FOUND & Double = js.native
  
  @js.native
  sealed trait UNREACHABLE_PATTERN
    extends StObject
       with LexerDefinitionErrorType
  /* 14 */ val UNREACHABLE_PATTERN: typings.chevrotainTypes.mod.LexerDefinitionErrorType.UNREACHABLE_PATTERN & Double = js.native
  
  @js.native
  sealed trait UNSUPPORTED_FLAGS_FOUND
    extends StObject
       with LexerDefinitionErrorType
  /* 3 */ val UNSUPPORTED_FLAGS_FOUND: typings.chevrotainTypes.mod.LexerDefinitionErrorType.UNSUPPORTED_FLAGS_FOUND & Double = js.native
}
