package typings.casperjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Utils extends StObject {
  
  def betterTypeOf(input: Any): Any
  
  def dump(value: Any): Any
  
  def fileExt(file: String): Any
  
  def fillBlanks(text: String, pad: Double): Any
  
  def format(f: String, args: Any*): Any
  
  def getPropertyPath(obj: Any, path: String): Any
  
  def inherits(ctor: Any, superCtor: Any): Any
  
  def isArray(value: Any): Any
  
  def isCasperObject(value: Any): Any
  
  def isClipRect(value: Any): Any
  
  def isFalsy(subject: Any): Any
  
  def isFunction(value: Any): Any
  
  def isJsFile(file: String): Any
  
  def isNull(value: Any): Any
  
  def isNumber(value: Any): Any
  
  def isObject(value: Any): Any
  
  def isRegExp(value: Any): Any
  
  def isString(value: Any): Any
  
  def isTruthy(subject: Any): Any
  
  def isType(what: Any, `type`: String): Any
  
  def isUndefined(value: Any): Any
  
  def isWebPage(what: Any): Any
  
  def mergeObjects(origin: Any, add: Any): Any
  
  def node(name: String, attributes: Any): Any
  
  def serialize(value: Any): Any
  
  def unique(array: js.Array[Any]): Any
}
object Utils {
  
  inline def apply(
    betterTypeOf: Any => Any,
    dump: Any => Any,
    fileExt: String => Any,
    fillBlanks: (String, Double) => Any,
    format: (String, /* repeated */ Any) => Any,
    getPropertyPath: (Any, String) => Any,
    inherits: (Any, Any) => Any,
    isArray: Any => Any,
    isCasperObject: Any => Any,
    isClipRect: Any => Any,
    isFalsy: Any => Any,
    isFunction: Any => Any,
    isJsFile: String => Any,
    isNull: Any => Any,
    isNumber: Any => Any,
    isObject: Any => Any,
    isRegExp: Any => Any,
    isString: Any => Any,
    isTruthy: Any => Any,
    isType: (Any, String) => Any,
    isUndefined: Any => Any,
    isWebPage: Any => Any,
    mergeObjects: (Any, Any) => Any,
    node: (String, Any) => Any,
    serialize: Any => Any,
    unique: js.Array[Any] => Any
  ): Utils = {
    val __obj = js.Dynamic.literal(betterTypeOf = js.Any.fromFunction1(betterTypeOf), dump = js.Any.fromFunction1(dump), fileExt = js.Any.fromFunction1(fileExt), fillBlanks = js.Any.fromFunction2(fillBlanks), format = js.Any.fromFunction2(format), getPropertyPath = js.Any.fromFunction2(getPropertyPath), inherits = js.Any.fromFunction2(inherits), isArray = js.Any.fromFunction1(isArray), isCasperObject = js.Any.fromFunction1(isCasperObject), isClipRect = js.Any.fromFunction1(isClipRect), isFalsy = js.Any.fromFunction1(isFalsy), isFunction = js.Any.fromFunction1(isFunction), isJsFile = js.Any.fromFunction1(isJsFile), isNull = js.Any.fromFunction1(isNull), isNumber = js.Any.fromFunction1(isNumber), isObject = js.Any.fromFunction1(isObject), isRegExp = js.Any.fromFunction1(isRegExp), isString = js.Any.fromFunction1(isString), isTruthy = js.Any.fromFunction1(isTruthy), isType = js.Any.fromFunction2(isType), isUndefined = js.Any.fromFunction1(isUndefined), isWebPage = js.Any.fromFunction1(isWebPage), mergeObjects = js.Any.fromFunction2(mergeObjects), node = js.Any.fromFunction2(node), serialize = js.Any.fromFunction1(serialize), unique = js.Any.fromFunction1(unique))
    __obj.asInstanceOf[Utils]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Utils] (val x: Self) extends AnyVal {
    
    inline def setBetterTypeOf(value: Any => Any): Self = StObject.set(x, "betterTypeOf", js.Any.fromFunction1(value))
    
    inline def setDump(value: Any => Any): Self = StObject.set(x, "dump", js.Any.fromFunction1(value))
    
    inline def setFileExt(value: String => Any): Self = StObject.set(x, "fileExt", js.Any.fromFunction1(value))
    
    inline def setFillBlanks(value: (String, Double) => Any): Self = StObject.set(x, "fillBlanks", js.Any.fromFunction2(value))
    
    inline def setFormat(value: (String, /* repeated */ Any) => Any): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
    
    inline def setGetPropertyPath(value: (Any, String) => Any): Self = StObject.set(x, "getPropertyPath", js.Any.fromFunction2(value))
    
    inline def setInherits(value: (Any, Any) => Any): Self = StObject.set(x, "inherits", js.Any.fromFunction2(value))
    
    inline def setIsArray(value: Any => Any): Self = StObject.set(x, "isArray", js.Any.fromFunction1(value))
    
    inline def setIsCasperObject(value: Any => Any): Self = StObject.set(x, "isCasperObject", js.Any.fromFunction1(value))
    
    inline def setIsClipRect(value: Any => Any): Self = StObject.set(x, "isClipRect", js.Any.fromFunction1(value))
    
    inline def setIsFalsy(value: Any => Any): Self = StObject.set(x, "isFalsy", js.Any.fromFunction1(value))
    
    inline def setIsFunction(value: Any => Any): Self = StObject.set(x, "isFunction", js.Any.fromFunction1(value))
    
    inline def setIsJsFile(value: String => Any): Self = StObject.set(x, "isJsFile", js.Any.fromFunction1(value))
    
    inline def setIsNull(value: Any => Any): Self = StObject.set(x, "isNull", js.Any.fromFunction1(value))
    
    inline def setIsNumber(value: Any => Any): Self = StObject.set(x, "isNumber", js.Any.fromFunction1(value))
    
    inline def setIsObject(value: Any => Any): Self = StObject.set(x, "isObject", js.Any.fromFunction1(value))
    
    inline def setIsRegExp(value: Any => Any): Self = StObject.set(x, "isRegExp", js.Any.fromFunction1(value))
    
    inline def setIsString(value: Any => Any): Self = StObject.set(x, "isString", js.Any.fromFunction1(value))
    
    inline def setIsTruthy(value: Any => Any): Self = StObject.set(x, "isTruthy", js.Any.fromFunction1(value))
    
    inline def setIsType(value: (Any, String) => Any): Self = StObject.set(x, "isType", js.Any.fromFunction2(value))
    
    inline def setIsUndefined(value: Any => Any): Self = StObject.set(x, "isUndefined", js.Any.fromFunction1(value))
    
    inline def setIsWebPage(value: Any => Any): Self = StObject.set(x, "isWebPage", js.Any.fromFunction1(value))
    
    inline def setMergeObjects(value: (Any, Any) => Any): Self = StObject.set(x, "mergeObjects", js.Any.fromFunction2(value))
    
    inline def setNode(value: (String, Any) => Any): Self = StObject.set(x, "node", js.Any.fromFunction2(value))
    
    inline def setSerialize(value: Any => Any): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
    
    inline def setUnique(value: js.Array[Any] => Any): Self = StObject.set(x, "unique", js.Any.fromFunction1(value))
  }
}
