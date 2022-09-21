package typings.typescriptNn5FuAjk.ts

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateLiteralType
  extends StObject
     with Type {
  
  var texts: Array[java.lang.String]
  
  var types: Array[Type]
}
object TemplateLiteralType {
  
  inline def apply(
    flags: TypeFlags,
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
    isClass: () => /* is .typescript-nn5FuAjk.ts.InterfaceType */ Boolean,
    isClassOrInterface: () => /* is .typescript-nn5FuAjk.ts.InterfaceType */ Boolean,
    isIndexType: () => /* is .typescript-nn5FuAjk.ts.IndexType */ Boolean,
    isIntersection: () => /* is .typescript-nn5FuAjk.ts.IntersectionType */ Boolean,
    isLiteral: () => /* is .typescript-nn5FuAjk.ts.LiteralType */ Boolean,
    isNumberLiteral: () => /* is .typescript-nn5FuAjk.ts.NumberLiteralType */ Boolean,
    isStringLiteral: () => /* is .typescript-nn5FuAjk.ts.StringLiteralType */ Boolean,
    isTypeParameter: () => /* is .typescript-nn5FuAjk.ts.TypeParameter */ Boolean,
    isUnion: () => /* is .typescript-nn5FuAjk.ts.UnionType */ Boolean,
    isUnionOrIntersection: () => /* is .typescript-nn5FuAjk.ts.UnionOrIntersectionType */ Boolean,
    symbol: Symbol,
    texts: Array[java.lang.String],
    types: Array[Type]
  ): TemplateLiteralType = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIndexType = js.Any.fromFunction0(isIndexType), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), symbol = symbol.asInstanceOf[js.Any], texts = texts.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateLiteralType]
  }
  
  extension [Self <: TemplateLiteralType](x: Self) {
    
    inline def setTexts(value: Array[java.lang.String]): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: Array[Type]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
  }
}
