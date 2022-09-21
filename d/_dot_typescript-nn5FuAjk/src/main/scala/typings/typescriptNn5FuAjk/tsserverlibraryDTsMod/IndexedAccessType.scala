package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexedAccessType
  extends StObject
     with Type {
  
  var constraint: js.UndefOr[Type] = js.undefined
  
  var indexType: Type
  
  var objectType: Type
  
  var simplifiedForReading: js.UndefOr[Type] = js.undefined
  
  var simplifiedForWriting: js.UndefOr[Type] = js.undefined
}
object IndexedAccessType {
  
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
    indexType: Type,
    isClass: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk/lib/tsserverlibrary.d.ts.InterfaceType */ Boolean,
    isClassOrInterface: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk/lib/tsserverlibrary.d.ts.InterfaceType */ Boolean,
    isIndexType: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk/lib/tsserverlibrary.d.ts.IndexType */ Boolean,
    isIntersection: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk/lib/tsserverlibrary.d.ts.IntersectionType */ Boolean,
    isLiteral: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk/lib/tsserverlibrary.d.ts.LiteralType */ Boolean,
    isNumberLiteral: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk/lib/tsserverlibrary.d.ts.NumberLiteralType */ Boolean,
    isStringLiteral: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk/lib/tsserverlibrary.d.ts.StringLiteralType */ Boolean,
    isTypeParameter: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk/lib/tsserverlibrary.d.ts.TypeParameter */ Boolean,
    isUnion: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk/lib/tsserverlibrary.d.ts.UnionType */ Boolean,
    isUnionOrIntersection: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk/lib/tsserverlibrary.d.ts.UnionOrIntersectionType */ Boolean,
    objectType: Type,
    symbol: Symbol
  ): IndexedAccessType = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), indexType = indexType.asInstanceOf[js.Any], isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIndexType = js.Any.fromFunction0(isIndexType), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), objectType = objectType.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedAccessType]
  }
  
  extension [Self <: IndexedAccessType](x: Self) {
    
    inline def setConstraint(value: Type): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
    
    inline def setIndexType(value: Type): Self = StObject.set(x, "indexType", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: Type): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setSimplifiedForReading(value: Type): Self = StObject.set(x, "simplifiedForReading", value.asInstanceOf[js.Any])
    
    inline def setSimplifiedForReadingUndefined: Self = StObject.set(x, "simplifiedForReading", js.undefined)
    
    inline def setSimplifiedForWriting(value: Type): Self = StObject.set(x, "simplifiedForWriting", value.asInstanceOf[js.Any])
    
    inline def setSimplifiedForWritingUndefined: Self = StObject.set(x, "simplifiedForWriting", js.undefined)
  }
}
