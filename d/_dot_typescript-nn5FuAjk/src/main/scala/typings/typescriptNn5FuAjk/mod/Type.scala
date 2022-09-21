package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type
  extends StObject
     with FlowType {
  
  var aliasSymbol: js.UndefOr[Symbol] = js.undefined
  
  var aliasTypeArguments: js.UndefOr[Array[Type]] = js.undefined
  
  var flags: TypeFlags
  
  def getApparentProperties(): Array[Symbol]
  
  def getBaseTypes(): js.UndefOr[Array[BaseType]]
  
  def getCallSignatures(): Array[Signature]
  
  def getConstraint(): js.UndefOr[Type]
  
  def getConstructSignatures(): Array[Signature]
  
  def getDefault(): js.UndefOr[Type]
  
  def getFlags(): TypeFlags
  
  def getNonNullableType(): Type
  
  def getNumberIndexType(): js.UndefOr[Type]
  
  def getProperties(): Array[Symbol]
  
  def getProperty(propertyName: java.lang.String): js.UndefOr[Symbol]
  
  def getStringIndexType(): js.UndefOr[Type]
  
  def getSymbol(): js.UndefOr[Symbol]
  
  def isClass(): /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.InterfaceType */ Boolean
  
  def isClassOrInterface(): /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.InterfaceType */ Boolean
  
  def isIndexType(): /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.IndexType */ Boolean
  
  def isIntersection(): /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.IntersectionType */ Boolean
  
  def isLiteral(): /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.LiteralType */ Boolean
  
  def isNumberLiteral(): /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.NumberLiteralType */ Boolean
  
  def isStringLiteral(): /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.StringLiteralType */ Boolean
  
  def isTypeParameter(): /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.TypeParameter */ Boolean
  
  def isUnion(): /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.UnionType */ Boolean
  
  def isUnionOrIntersection(): /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.UnionOrIntersectionType */ Boolean
  
  var pattern: js.UndefOr[DestructuringPattern] = js.undefined
  
  var symbol: Symbol
}
object Type {
  
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
    symbol: Symbol
  ): Type = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIndexType = js.Any.fromFunction0(isIndexType), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setAliasSymbol(value: Symbol): Self = StObject.set(x, "aliasSymbol", value.asInstanceOf[js.Any])
    
    inline def setAliasSymbolUndefined: Self = StObject.set(x, "aliasSymbol", js.undefined)
    
    inline def setAliasTypeArguments(value: Array[Type]): Self = StObject.set(x, "aliasTypeArguments", value.asInstanceOf[js.Any])
    
    inline def setAliasTypeArgumentsUndefined: Self = StObject.set(x, "aliasTypeArguments", js.undefined)
    
    inline def setFlags(value: TypeFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setGetApparentProperties(value: () => Array[Symbol]): Self = StObject.set(x, "getApparentProperties", js.Any.fromFunction0(value))
    
    inline def setGetBaseTypes(value: () => js.UndefOr[Array[BaseType]]): Self = StObject.set(x, "getBaseTypes", js.Any.fromFunction0(value))
    
    inline def setGetCallSignatures(value: () => Array[Signature]): Self = StObject.set(x, "getCallSignatures", js.Any.fromFunction0(value))
    
    inline def setGetConstraint(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getConstraint", js.Any.fromFunction0(value))
    
    inline def setGetConstructSignatures(value: () => Array[Signature]): Self = StObject.set(x, "getConstructSignatures", js.Any.fromFunction0(value))
    
    inline def setGetDefault(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
    
    inline def setGetFlags(value: () => TypeFlags): Self = StObject.set(x, "getFlags", js.Any.fromFunction0(value))
    
    inline def setGetNonNullableType(value: () => Type): Self = StObject.set(x, "getNonNullableType", js.Any.fromFunction0(value))
    
    inline def setGetNumberIndexType(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getNumberIndexType", js.Any.fromFunction0(value))
    
    inline def setGetProperties(value: () => Array[Symbol]): Self = StObject.set(x, "getProperties", js.Any.fromFunction0(value))
    
    inline def setGetProperty(value: java.lang.String => js.UndefOr[Symbol]): Self = StObject.set(x, "getProperty", js.Any.fromFunction1(value))
    
    inline def setGetStringIndexType(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getStringIndexType", js.Any.fromFunction0(value))
    
    inline def setGetSymbol(value: () => js.UndefOr[Symbol]): Self = StObject.set(x, "getSymbol", js.Any.fromFunction0(value))
    
    inline def setIsClass(value: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.InterfaceType */ Boolean): Self = StObject.set(x, "isClass", js.Any.fromFunction0(value))
    
    inline def setIsClassOrInterface(value: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.InterfaceType */ Boolean): Self = StObject.set(x, "isClassOrInterface", js.Any.fromFunction0(value))
    
    inline def setIsIndexType(value: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.IndexType */ Boolean): Self = StObject.set(x, "isIndexType", js.Any.fromFunction0(value))
    
    inline def setIsIntersection(value: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.IntersectionType */ Boolean): Self = StObject.set(x, "isIntersection", js.Any.fromFunction0(value))
    
    inline def setIsLiteral(value: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.LiteralType */ Boolean): Self = StObject.set(x, "isLiteral", js.Any.fromFunction0(value))
    
    inline def setIsNumberLiteral(value: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.NumberLiteralType */ Boolean): Self = StObject.set(x, "isNumberLiteral", js.Any.fromFunction0(value))
    
    inline def setIsStringLiteral(value: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.StringLiteralType */ Boolean): Self = StObject.set(x, "isStringLiteral", js.Any.fromFunction0(value))
    
    inline def setIsTypeParameter(value: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.TypeParameter */ Boolean): Self = StObject.set(x, "isTypeParameter", js.Any.fromFunction0(value))
    
    inline def setIsUnion(value: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.UnionType */ Boolean): Self = StObject.set(x, "isUnion", js.Any.fromFunction0(value))
    
    inline def setIsUnionOrIntersection(value: () => /* is .typescript-nn5FuAjk..typescript-nn5FuAjk.UnionOrIntersectionType */ Boolean): Self = StObject.set(x, "isUnionOrIntersection", js.Any.fromFunction0(value))
    
    inline def setPattern(value: DestructuringPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setSymbol(value: Symbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
