package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TypePredicateKind.AssertsIdentifier
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TypePredicateKind.AssertsThis
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TypePredicateKind.This
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ThisTypePredicate
  - typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.IdentifierTypePredicate
  - typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.AssertsThisTypePredicate
  - typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.AssertsIdentifierTypePredicate
*/
trait TypePredicate extends StObject
object TypePredicate {
  
  inline def AssertsIdentifierTypePredicate(kind: AssertsIdentifier, parameterIndex: Double, parameterName: java.lang.String): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.AssertsIdentifierTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.AssertsIdentifierTypePredicate]
  }
  
  inline def AssertsThisTypePredicate(kind: AssertsThis, parameterIndex: Unit, parameterName: Unit): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.AssertsThisTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.AssertsThisTypePredicate]
  }
  
  inline def IdentifierTypePredicate(
    kind: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TypePredicateKind.Identifier,
    parameterIndex: Double,
    parameterName: java.lang.String,
    `type`: Type
  ): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.IdentifierTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.IdentifierTypePredicate]
  }
  
  inline def ThisTypePredicate(kind: This, parameterIndex: Unit, parameterName: Unit, `type`: Type): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ThisTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ThisTypePredicate]
  }
}
