package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenClass extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "TokenClass")
@js.native
object TokenClass extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenClass & Double] = js.native
  
  @js.native
  sealed trait BigIntLiteral
    extends StObject
       with TokenClass
  /* 7 */ val BigIntLiteral: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TokenClass.BigIntLiteral & Double = js.native
  
  @js.native
  sealed trait Comment
    extends StObject
       with TokenClass
  /* 3 */ val Comment: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TokenClass.Comment & Double = js.native
  
  @js.native
  sealed trait Identifier
    extends StObject
       with TokenClass
  /* 5 */ val Identifier: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TokenClass.Identifier & Double = js.native
  
  @js.native
  sealed trait Keyword
    extends StObject
       with TokenClass
  /* 1 */ val Keyword: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TokenClass.Keyword & Double = js.native
  
  @js.native
  sealed trait NumberLiteral
    extends StObject
       with TokenClass
  /* 6 */ val NumberLiteral: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TokenClass.NumberLiteral & Double = js.native
  
  @js.native
  sealed trait Operator
    extends StObject
       with TokenClass
  /* 2 */ val Operator: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TokenClass.Operator & Double = js.native
  
  @js.native
  sealed trait Punctuation
    extends StObject
       with TokenClass
  /* 0 */ val Punctuation: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TokenClass.Punctuation & Double = js.native
  
  @js.native
  sealed trait RegExpLiteral
    extends StObject
       with TokenClass
  /* 9 */ val RegExpLiteral: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TokenClass.RegExpLiteral & Double = js.native
  
  @js.native
  sealed trait StringLiteral
    extends StObject
       with TokenClass
  /* 8 */ val StringLiteral: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TokenClass.StringLiteral & Double = js.native
  
  @js.native
  sealed trait Whitespace
    extends StObject
       with TokenClass
  /* 4 */ val Whitespace: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TokenClass.Whitespace & Double = js.native
}
