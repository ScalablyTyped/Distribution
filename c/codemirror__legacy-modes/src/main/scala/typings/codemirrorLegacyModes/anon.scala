package typings.codemirrorLegacyModes

import org.scalablytyped.runtime.StringDictionary
import typings.codemirrorLegacyModes.modeSimpleModeMod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccessTypes extends StObject {
    
    var accessTypes: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var cmipVerbs: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var compareTypes: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var keywords: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var modifier: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var multiLineStrings: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var storage: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var tags: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object AccessTypes {
    
    inline def apply(): AccessTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccessTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessTypes] (val x: Self) extends AnyVal {
      
      inline def setAccessTypes(value: StringDictionary[Any]): Self = StObject.set(x, "accessTypes", value.asInstanceOf[js.Any])
      
      inline def setAccessTypesUndefined: Self = StObject.set(x, "accessTypes", js.undefined)
      
      inline def setCmipVerbs(value: StringDictionary[Any]): Self = StObject.set(x, "cmipVerbs", value.asInstanceOf[js.Any])
      
      inline def setCmipVerbsUndefined: Self = StObject.set(x, "cmipVerbs", js.undefined)
      
      inline def setCompareTypes(value: StringDictionary[Any]): Self = StObject.set(x, "compareTypes", value.asInstanceOf[js.Any])
      
      inline def setCompareTypesUndefined: Self = StObject.set(x, "compareTypes", js.undefined)
      
      inline def setKeywords(value: StringDictionary[Any]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setModifier(value: StringDictionary[Any]): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
      
      inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
      
      inline def setMultiLineStrings(value: Boolean): Self = StObject.set(x, "multiLineStrings", value.asInstanceOf[js.Any])
      
      inline def setMultiLineStringsUndefined: Self = StObject.set(x, "multiLineStrings", js.undefined)
      
      inline def setStatus(value: StringDictionary[Any]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStorage(value: StringDictionary[Any]): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      
      inline def setTags(value: StringDictionary[Any]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait Atoms extends StObject {
    
    var atoms: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var blockKeywords: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var builtin: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var dontAlignCalls: js.UndefOr[Boolean] = js.undefined
    
    var hooks: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var indentStatements: js.UndefOr[Boolean] = js.undefined
    
    var indentSwitch: js.UndefOr[Boolean] = js.undefined
    
    var isIdentifierChar: js.UndefOr[js.RegExp] = js.undefined
    
    var isOperatorChar: js.UndefOr[js.RegExp] = js.undefined
    
    var isPunctuationChar: js.UndefOr[js.RegExp] = js.undefined
    
    var isReservedIdentifier: js.UndefOr[js.Function1[/* id */ String, Boolean]] = js.undefined
    
    var keywords: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var multiLineStrings: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var namespaceSeparator: js.UndefOr[String] = js.undefined
    
    var number: js.UndefOr[js.RegExp] = js.undefined
    
    var numberStart: js.UndefOr[js.RegExp] = js.undefined
    
    var statementIndentUnit: js.UndefOr[Double] = js.undefined
    
    var types: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object Atoms {
    
    inline def apply(name: String): Atoms = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Atoms]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Atoms] (val x: Self) extends AnyVal {
      
      inline def setAtoms(value: StringDictionary[Any]): Self = StObject.set(x, "atoms", value.asInstanceOf[js.Any])
      
      inline def setAtomsUndefined: Self = StObject.set(x, "atoms", js.undefined)
      
      inline def setBlockKeywords(value: StringDictionary[Any]): Self = StObject.set(x, "blockKeywords", value.asInstanceOf[js.Any])
      
      inline def setBlockKeywordsUndefined: Self = StObject.set(x, "blockKeywords", js.undefined)
      
      inline def setBuiltin(value: StringDictionary[Any]): Self = StObject.set(x, "builtin", value.asInstanceOf[js.Any])
      
      inline def setBuiltinUndefined: Self = StObject.set(x, "builtin", js.undefined)
      
      inline def setDontAlignCalls(value: Boolean): Self = StObject.set(x, "dontAlignCalls", value.asInstanceOf[js.Any])
      
      inline def setDontAlignCallsUndefined: Self = StObject.set(x, "dontAlignCalls", js.undefined)
      
      inline def setHooks(value: StringDictionary[Any]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      inline def setIndentStatements(value: Boolean): Self = StObject.set(x, "indentStatements", value.asInstanceOf[js.Any])
      
      inline def setIndentStatementsUndefined: Self = StObject.set(x, "indentStatements", js.undefined)
      
      inline def setIndentSwitch(value: Boolean): Self = StObject.set(x, "indentSwitch", value.asInstanceOf[js.Any])
      
      inline def setIndentSwitchUndefined: Self = StObject.set(x, "indentSwitch", js.undefined)
      
      inline def setIsIdentifierChar(value: js.RegExp): Self = StObject.set(x, "isIdentifierChar", value.asInstanceOf[js.Any])
      
      inline def setIsIdentifierCharUndefined: Self = StObject.set(x, "isIdentifierChar", js.undefined)
      
      inline def setIsOperatorChar(value: js.RegExp): Self = StObject.set(x, "isOperatorChar", value.asInstanceOf[js.Any])
      
      inline def setIsOperatorCharUndefined: Self = StObject.set(x, "isOperatorChar", js.undefined)
      
      inline def setIsPunctuationChar(value: js.RegExp): Self = StObject.set(x, "isPunctuationChar", value.asInstanceOf[js.Any])
      
      inline def setIsPunctuationCharUndefined: Self = StObject.set(x, "isPunctuationChar", js.undefined)
      
      inline def setIsReservedIdentifier(value: /* id */ String => Boolean): Self = StObject.set(x, "isReservedIdentifier", js.Any.fromFunction1(value))
      
      inline def setIsReservedIdentifierUndefined: Self = StObject.set(x, "isReservedIdentifier", js.undefined)
      
      inline def setKeywords(value: StringDictionary[Any]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setMultiLineStrings(value: Boolean): Self = StObject.set(x, "multiLineStrings", value.asInstanceOf[js.Any])
      
      inline def setMultiLineStringsUndefined: Self = StObject.set(x, "multiLineStrings", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespaceSeparator(value: String): Self = StObject.set(x, "namespaceSeparator", value.asInstanceOf[js.Any])
      
      inline def setNamespaceSeparatorUndefined: Self = StObject.set(x, "namespaceSeparator", js.undefined)
      
      inline def setNumber(value: js.RegExp): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberStart(value: js.RegExp): Self = StObject.set(x, "numberStart", value.asInstanceOf[js.Any])
      
      inline def setNumberStartUndefined: Self = StObject.set(x, "numberStart", js.undefined)
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setStatementIndentUnit(value: Double): Self = StObject.set(x, "statementIndentUnit", value.asInstanceOf[js.Any])
      
      inline def setStatementIndentUnitUndefined: Self = StObject.set(x, "statementIndentUnit", js.undefined)
      
      inline def setTypes(value: StringDictionary[Any]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    }
  }
  
  trait BackslashStringEscapes extends StObject {
    
    var atoms: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var backslashStringEscapes: js.UndefOr[Boolean] = js.undefined
    
    var brackets: js.UndefOr[js.RegExp] = js.undefined
    
    var builtin: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var client: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var dateSQL: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var hooks: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var keywords: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var operatorChars: js.UndefOr[js.RegExp] = js.undefined
    
    var punctuation: js.UndefOr[js.RegExp] = js.undefined
    
    var support: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object BackslashStringEscapes {
    
    inline def apply(): BackslashStringEscapes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackslashStringEscapes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BackslashStringEscapes] (val x: Self) extends AnyVal {
      
      inline def setAtoms(value: StringDictionary[Any]): Self = StObject.set(x, "atoms", value.asInstanceOf[js.Any])
      
      inline def setAtomsUndefined: Self = StObject.set(x, "atoms", js.undefined)
      
      inline def setBackslashStringEscapes(value: Boolean): Self = StObject.set(x, "backslashStringEscapes", value.asInstanceOf[js.Any])
      
      inline def setBackslashStringEscapesUndefined: Self = StObject.set(x, "backslashStringEscapes", js.undefined)
      
      inline def setBrackets(value: js.RegExp): Self = StObject.set(x, "brackets", value.asInstanceOf[js.Any])
      
      inline def setBracketsUndefined: Self = StObject.set(x, "brackets", js.undefined)
      
      inline def setBuiltin(value: StringDictionary[Any]): Self = StObject.set(x, "builtin", value.asInstanceOf[js.Any])
      
      inline def setBuiltinUndefined: Self = StObject.set(x, "builtin", js.undefined)
      
      inline def setClient(value: StringDictionary[Any]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setDateSQL(value: StringDictionary[Any]): Self = StObject.set(x, "dateSQL", value.asInstanceOf[js.Any])
      
      inline def setDateSQLUndefined: Self = StObject.set(x, "dateSQL", js.undefined)
      
      inline def setHooks(value: StringDictionary[Any]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      inline def setKeywords(value: StringDictionary[Any]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setOperatorChars(value: js.RegExp): Self = StObject.set(x, "operatorChars", value.asInstanceOf[js.Any])
      
      inline def setOperatorCharsUndefined: Self = StObject.set(x, "operatorChars", js.undefined)
      
      inline def setPunctuation(value: js.RegExp): Self = StObject.set(x, "punctuation", value.asInstanceOf[js.Any])
      
      inline def setPunctuationUndefined: Self = StObject.set(x, "punctuation", js.undefined)
      
      inline def setSupport(value: StringDictionary[Any]): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
      
      inline def setSupportUndefined: Self = StObject.set(x, "support", js.undefined)
    }
  }
  
  trait Start extends StObject {
    
    var start: js.Array[Rule]
  }
  object Start {
    
    inline def apply(start: js.Array[Rule]): Start = {
      val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Start]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Start] (val x: Self) extends AnyVal {
      
      inline def setStart(value: js.Array[Rule]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartVarargs(value: Rule*): Self = StObject.set(x, "start", js.Array(value*))
    }
  }
}
