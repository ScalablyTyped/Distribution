package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptElementKind extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "ScriptElementKind")
@js.native
object ScriptElementKind extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ScriptElementKind & java.lang.String] = js.native
  
  @js.native
  sealed trait alias
    extends StObject
       with ScriptElementKind
  /* "alias" */ val alias: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.alias & java.lang.String = js.native
  
  /** interface Y { ():number; } */
  @js.native
  sealed trait callSignatureElement
    extends StObject
       with ScriptElementKind
  /* "call" */ val callSignatureElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.callSignatureElement & java.lang.String = js.native
  
  /** class X {} */
  @js.native
  sealed trait classElement
    extends StObject
       with ScriptElementKind
  /* "class" */ val classElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.classElement & java.lang.String = js.native
  
  @js.native
  sealed trait constElement
    extends StObject
       with ScriptElementKind
  /* "const" */ val constElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.constElement & java.lang.String = js.native
  
  /** interface Y { new():Y; } */
  @js.native
  sealed trait constructSignatureElement
    extends StObject
       with ScriptElementKind
  /* "construct" */ val constructSignatureElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.constructSignatureElement & java.lang.String = js.native
  
  /**
    * class X { constructor() { } }
    * class X { static { } }
    */
  @js.native
  sealed trait constructorImplementationElement
    extends StObject
       with ScriptElementKind
  /* "constructor" */ val constructorImplementationElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.constructorImplementationElement & java.lang.String = js.native
  
  @js.native
  sealed trait directory
    extends StObject
       with ScriptElementKind
  /* "directory" */ val directory: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.directory & java.lang.String = js.native
  
  /** enum E */
  @js.native
  sealed trait enumElement
    extends StObject
       with ScriptElementKind
  /* "enum" */ val enumElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.enumElement & java.lang.String = js.native
  
  @js.native
  sealed trait enumMemberElement
    extends StObject
       with ScriptElementKind
  /* "enum member" */ val enumMemberElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.enumMemberElement & java.lang.String = js.native
  
  @js.native
  sealed trait externalModuleName
    extends StObject
       with ScriptElementKind
  /* "external module name" */ val externalModuleName: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.externalModuleName & java.lang.String = js.native
  
  /**
    * Inside module and script only
    * function f() { }
    */
  @js.native
  sealed trait functionElement
    extends StObject
       with ScriptElementKind
  /* "function" */ val functionElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.functionElement & java.lang.String = js.native
  
  /** interface Y { []:number; } */
  @js.native
  sealed trait indexSignatureElement
    extends StObject
       with ScriptElementKind
  /* "index" */ val indexSignatureElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.indexSignatureElement & java.lang.String = js.native
  
  /** interface Y {} */
  @js.native
  sealed trait interfaceElement
    extends StObject
       with ScriptElementKind
  /* "interface" */ val interfaceElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.interfaceElement & java.lang.String = js.native
  
  /**
    * <JsxTagName attribute1 attribute2={0} />
    * @deprecated
    */
  @js.native
  sealed trait jsxAttribute
    extends StObject
       with ScriptElementKind
  /* "JSX attribute" */ val jsxAttribute: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.jsxAttribute & java.lang.String = js.native
  
  /** predefined type (void) or keyword (class) */
  @js.native
  sealed trait keyword
    extends StObject
       with ScriptElementKind
  /* "keyword" */ val keyword: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.keyword & java.lang.String = js.native
  
  @js.native
  sealed trait label
    extends StObject
       with ScriptElementKind
  /* "label" */ val label: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.label & java.lang.String = js.native
  
  @js.native
  sealed trait letElement
    extends StObject
       with ScriptElementKind
  /* "let" */ val letElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.letElement & java.lang.String = js.native
  
  /** Jsdoc @link: in `{@link C link text}`, the before and after text "{@link " and "}" */
  @js.native
  sealed trait link
    extends StObject
       with ScriptElementKind
  /* "link" */ val link: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.link & java.lang.String = js.native
  
  /** Jsdoc @link: in `{@link C link text}`, the entity name "C" */
  @js.native
  sealed trait linkName
    extends StObject
       with ScriptElementKind
  /* "link name" */ val linkName: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.linkName & java.lang.String = js.native
  
  /** Jsdoc @link: in `{@link C link text}`, the link text "link text" */
  @js.native
  sealed trait linkText
    extends StObject
       with ScriptElementKind
  /* "link text" */ val linkText: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.linkText & java.lang.String = js.native
  
  /** var x = class X {} */
  @js.native
  sealed trait localClassElement
    extends StObject
       with ScriptElementKind
  /* "local class" */ val localClassElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.localClassElement & java.lang.String = js.native
  
  /** Inside function */
  @js.native
  sealed trait localFunctionElement
    extends StObject
       with ScriptElementKind
  /* "local function" */ val localFunctionElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.localFunctionElement & java.lang.String = js.native
  
  /** Inside function */
  @js.native
  sealed trait localVariableElement
    extends StObject
       with ScriptElementKind
  /* "local var" */ val localVariableElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.localVariableElement & java.lang.String = js.native
  
  /** class X { [public|private]* foo() {} } */
  @js.native
  sealed trait memberFunctionElement
    extends StObject
       with ScriptElementKind
  /* "method" */ val memberFunctionElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.memberFunctionElement & java.lang.String = js.native
  
  /** class X { [public|private]* [get|set] foo:number; } */
  @js.native
  sealed trait memberGetAccessorElement
    extends StObject
       with ScriptElementKind
  /* "getter" */ val memberGetAccessorElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.memberGetAccessorElement & java.lang.String = js.native
  
  @js.native
  sealed trait memberSetAccessorElement
    extends StObject
       with ScriptElementKind
  /* "setter" */ val memberSetAccessorElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.memberSetAccessorElement & java.lang.String = js.native
  
  /**
    * class X { [public|private]* foo:number; }
    * interface Y { foo:number; }
    */
  @js.native
  sealed trait memberVariableElement
    extends StObject
       with ScriptElementKind
  /* "property" */ val memberVariableElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.memberVariableElement & java.lang.String = js.native
  
  /** module foo {} */
  @js.native
  sealed trait moduleElement
    extends StObject
       with ScriptElementKind
  /* "module" */ val moduleElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.moduleElement & java.lang.String = js.native
  
  /** function foo(*Y*: string) */
  @js.native
  sealed trait parameterElement
    extends StObject
       with ScriptElementKind
  /* "parameter" */ val parameterElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.parameterElement & java.lang.String = js.native
  
  @js.native
  sealed trait primitiveType
    extends StObject
       with ScriptElementKind
  /* "primitive type" */ val primitiveType: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.primitiveType & java.lang.String = js.native
  
  /** top level script node */
  @js.native
  sealed trait scriptElement
    extends StObject
       with ScriptElementKind
  /* "script" */ val scriptElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.scriptElement & java.lang.String = js.native
  
  /** String literal */
  @js.native
  sealed trait string
    extends StObject
       with ScriptElementKind
  /* "string" */ val string: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.string & java.lang.String = js.native
  
  /** type T = ... */
  @js.native
  sealed trait typeElement
    extends StObject
       with ScriptElementKind
  /* "type" */ val typeElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.typeElement & java.lang.String = js.native
  
  @js.native
  sealed trait typeParameterElement
    extends StObject
       with ScriptElementKind
  /* "type parameter" */ val typeParameterElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.typeParameterElement & java.lang.String = js.native
  
  @js.native
  sealed trait unknown
    extends StObject
       with ScriptElementKind
  /* "" */ val unknown: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.unknown & java.lang.String = js.native
  
  /**
    * Inside module and script only
    * const v = ..
    */
  @js.native
  sealed trait variableElement
    extends StObject
       with ScriptElementKind
  /* "var" */ val variableElement: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.variableElement & java.lang.String = js.native
  
  @js.native
  sealed trait warning
    extends StObject
       with ScriptElementKind
  /* "warning" */ val warning: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind.warning & java.lang.String = js.native
}
