package typings.csstoolsCssParserAlgorithms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilComponentValueTypeMod {
  
  @js.native
  sealed trait ComponentValueType extends StObject
  @JSImport("@csstools/css-parser-algorithms/dist/util/component-value-type", "ComponentValueType")
  @js.native
  object ComponentValueType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ComponentValueType & String] = js.native
    
    @js.native
    sealed trait Comment
      extends StObject
         with ComponentValueType
    /* "comment" */ val Comment: typings.csstoolsCssParserAlgorithms.distUtilComponentValueTypeMod.ComponentValueType.Comment & String = js.native
    
    @js.native
    sealed trait Function
      extends StObject
         with ComponentValueType
    /* "function" */ val Function: typings.csstoolsCssParserAlgorithms.distUtilComponentValueTypeMod.ComponentValueType.Function & String = js.native
    
    @js.native
    sealed trait SimpleBlock
      extends StObject
         with ComponentValueType
    /* "simple-block" */ val SimpleBlock: typings.csstoolsCssParserAlgorithms.distUtilComponentValueTypeMod.ComponentValueType.SimpleBlock & String = js.native
    
    @js.native
    sealed trait Token
      extends StObject
         with ComponentValueType
    /* "token" */ val Token: typings.csstoolsCssParserAlgorithms.distUtilComponentValueTypeMod.ComponentValueType.Token & String = js.native
    
    @js.native
    sealed trait Whitespace
      extends StObject
         with ComponentValueType
    /* "whitespace" */ val Whitespace: typings.csstoolsCssParserAlgorithms.distUtilComponentValueTypeMod.ComponentValueType.Whitespace & String = js.native
  }
}
