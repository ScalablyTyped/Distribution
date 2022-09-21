package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberLiteralType
  extends StObject
     with LiteralType {
  
  @JSName("value")
  var value_NumberLiteralType: Double
}
object NumberLiteralType {
  
  inline def apply(
    flags: TypeFlags,
    freshType: LiteralType,
    getApparentProperties: () => Array[Symbol],
    getBaseTypes: () => js.UndefOr[Array[BaseType]],
    getCallSignatures: () => Array[Signature],
    getConstraint: () => js.UndefOr[Type],
    getConstructSignatures: () => Array[Signature],
    getDefault: () => js.UndefOr[Type],
    getFlags: () => TypeFlags,
    getNonNullableType: () => Type,
    getNumberIndexType: () => js.UndefOr[Type],
    getProperties: () => Array[Symbol],
    getProperty: java.lang.String => js.UndefOr[Symbol],
    getStringIndexType: () => js.UndefOr[Type],
    getSymbol: () => js.UndefOr[Symbol],
    isClass: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.InterfaceType */ Boolean,
    isClassOrInterface: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.InterfaceType */ Boolean,
    isIndexType: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.IndexType */ Boolean,
    isIntersection: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.IntersectionType */ Boolean,
    isLiteral: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.LiteralType */ Boolean,
    isNumberLiteral: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.NumberLiteralType */ Boolean,
    isStringLiteral: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.StringLiteralType */ Boolean,
    isTypeParameter: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.TypeParameter */ Boolean,
    isUnion: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.UnionType */ Boolean,
    isUnionOrIntersection: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.UnionOrIntersectionType */ Boolean,
    regularType: LiteralType,
    symbol: Symbol,
    value: Double
  ): NumberLiteralType = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], freshType = freshType.asInstanceOf[js.Any], getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIndexType = js.Any.fromFunction0(isIndexType), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), regularType = regularType.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberLiteralType]
  }
  
  extension [Self <: NumberLiteralType](x: Self) {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
