package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypePredicateKind extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "TypePredicateKind")
@js.native
object TypePredicateKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypePredicateKind & Double] = js.native
  
  @js.native
  sealed trait AssertsIdentifier
    extends StObject
       with TypePredicateKind
  /* 3 */ val AssertsIdentifier: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TypePredicateKind.AssertsIdentifier & Double = js.native
  
  @js.native
  sealed trait AssertsThis
    extends StObject
       with TypePredicateKind
  /* 2 */ val AssertsThis: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TypePredicateKind.AssertsThis & Double = js.native
  
  @js.native
  sealed trait Identifier
    extends StObject
       with TypePredicateKind
  /* 1 */ val Identifier: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TypePredicateKind.Identifier & Double = js.native
  
  @js.native
  sealed trait This
    extends StObject
       with TypePredicateKind
  /* 0 */ val This: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TypePredicateKind.This & Double = js.native
}
