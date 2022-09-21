package typings.typescriptNn5FuAjk.ts

import typings.typescriptNn5FuAjk.ts.TypePredicateKind.AssertsIdentifier
import typings.typescriptNn5FuAjk.ts.TypePredicateKind.AssertsThis
import typings.typescriptNn5FuAjk.ts.TypePredicateKind.This
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.ts.ThisTypePredicate
  - typings.typescriptNn5FuAjk.ts.IdentifierTypePredicate
  - typings.typescriptNn5FuAjk.ts.AssertsThisTypePredicate
  - typings.typescriptNn5FuAjk.ts.AssertsIdentifierTypePredicate
*/
trait TypePredicate extends StObject
object TypePredicate {
  
  inline def AssertsIdentifierTypePredicate(kind: AssertsIdentifier, parameterIndex: Double, parameterName: java.lang.String): typings.typescriptNn5FuAjk.ts.AssertsIdentifierTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.ts.AssertsIdentifierTypePredicate]
  }
  
  inline def AssertsThisTypePredicate(kind: AssertsThis, parameterIndex: Unit, parameterName: Unit): typings.typescriptNn5FuAjk.ts.AssertsThisTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.ts.AssertsThisTypePredicate]
  }
  
  inline def IdentifierTypePredicate(
    kind: typings.typescriptNn5FuAjk.ts.TypePredicateKind.Identifier,
    parameterIndex: Double,
    parameterName: java.lang.String,
    `type`: Type
  ): typings.typescriptNn5FuAjk.ts.IdentifierTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.ts.IdentifierTypePredicate]
  }
  
  inline def ThisTypePredicate(kind: This, parameterIndex: Unit, parameterName: Unit, `type`: Type): typings.typescriptNn5FuAjk.ts.ThisTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.ts.ThisTypePredicate]
  }
}
