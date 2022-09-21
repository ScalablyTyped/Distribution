package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptElementKind extends StObject
@JSImport(".typescript-nn5FuAjk/lib/protocol.d.ts", "ts.server.protocol.ScriptElementKind")
@js.native
object ScriptElementKind extends StObject {
  
  @js.native
  sealed trait alias
    extends StObject
       with ScriptElementKind
  
  /** interface Y { ():number; } */
  @js.native
  sealed trait callSignatureElement
    extends StObject
       with ScriptElementKind
  
  /** class X {} */
  @js.native
  sealed trait classElement
    extends StObject
       with ScriptElementKind
  
  @js.native
  sealed trait constElement
    extends StObject
       with ScriptElementKind
  
  /** interface Y { new():Y; } */
  @js.native
  sealed trait constructSignatureElement
    extends StObject
       with ScriptElementKind
  
  /**
    * class X { constructor() { } }
    * class X { static { } }
    */
  @js.native
  sealed trait constructorImplementationElement
    extends StObject
       with ScriptElementKind
  
  @js.native
  sealed trait directory
    extends StObject
       with ScriptElementKind
  
  /** enum E */
  @js.native
  sealed trait enumElement
    extends StObject
       with ScriptElementKind
  
  @js.native
  sealed trait enumMemberElement
    extends StObject
       with ScriptElementKind
  
  @js.native
  sealed trait externalModuleName
    extends StObject
       with ScriptElementKind
  
  /**
    * Inside module and script only
    * function f() { }
    */
  @js.native
  sealed trait functionElement
    extends StObject
       with ScriptElementKind
  
  /** interface Y { []:number; } */
  @js.native
  sealed trait indexSignatureElement
    extends StObject
       with ScriptElementKind
  
  /** interface Y {} */
  @js.native
  sealed trait interfaceElement
    extends StObject
       with ScriptElementKind
  
  /**
    * <JsxTagName attribute1 attribute2={0} />
    * @deprecated
    */
  @js.native
  sealed trait jsxAttribute
    extends StObject
       with ScriptElementKind
  
  /** predefined type (void) or keyword (class) */
  @js.native
  sealed trait keyword
    extends StObject
       with ScriptElementKind
  
  @js.native
  sealed trait label
    extends StObject
       with ScriptElementKind
  
  @js.native
  sealed trait letElement
    extends StObject
       with ScriptElementKind
  
  /** Jsdoc @link: in `{@link C link text}`, the before and after text "{@link " and "}" */
  @js.native
  sealed trait link
    extends StObject
       with ScriptElementKind
  
  /** Jsdoc @link: in `{@link C link text}`, the entity name "C" */
  @js.native
  sealed trait linkName
    extends StObject
       with ScriptElementKind
  
  /** Jsdoc @link: in `{@link C link text}`, the link text "link text" */
  @js.native
  sealed trait linkText
    extends StObject
       with ScriptElementKind
  
  /** var x = class X {} */
  @js.native
  sealed trait localClassElement
    extends StObject
       with ScriptElementKind
  
  /** Inside function */
  @js.native
  sealed trait localFunctionElement
    extends StObject
       with ScriptElementKind
  
  /** Inside function */
  @js.native
  sealed trait localVariableElement
    extends StObject
       with ScriptElementKind
  
  /** class X { [public|private]* foo() {} } */
  @js.native
  sealed trait memberFunctionElement
    extends StObject
       with ScriptElementKind
  
  /** class X { [public|private]* [get|set] foo:number; } */
  @js.native
  sealed trait memberGetAccessorElement
    extends StObject
       with ScriptElementKind
  
  @js.native
  sealed trait memberSetAccessorElement
    extends StObject
       with ScriptElementKind
  
  /**
    * class X { [public|private]* foo:number; }
    * interface Y { foo:number; }
    */
  @js.native
  sealed trait memberVariableElement
    extends StObject
       with ScriptElementKind
  
  /** module foo {} */
  @js.native
  sealed trait moduleElement
    extends StObject
       with ScriptElementKind
  
  /** function foo(*Y*: string) */
  @js.native
  sealed trait parameterElement
    extends StObject
       with ScriptElementKind
  
  @js.native
  sealed trait primitiveType
    extends StObject
       with ScriptElementKind
  
  /** top level script node */
  @js.native
  sealed trait scriptElement
    extends StObject
       with ScriptElementKind
  
  /** String literal */
  @js.native
  sealed trait string
    extends StObject
       with ScriptElementKind
  
  /** type T = ... */
  @js.native
  sealed trait typeElement
    extends StObject
       with ScriptElementKind
  
  @js.native
  sealed trait typeParameterElement
    extends StObject
       with ScriptElementKind
  
  @js.native
  sealed trait unknown
    extends StObject
       with ScriptElementKind
  
  /**
    * Inside module and script only
    * const v = ..
    */
  @js.native
  sealed trait variableElement
    extends StObject
       with ScriptElementKind
  
  @js.native
  sealed trait warning
    extends StObject
       with ScriptElementKind
}
