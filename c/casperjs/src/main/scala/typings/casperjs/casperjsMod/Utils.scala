package typings.casperjs.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils extends js.Object {
  def betterTypeOf(input: js.Any): js.Any
  def dump(value: js.Any): js.Any
  def fileExt(file: String): js.Any
  def fillBlanks(text: String, pad: Double): js.Any
  def format(f: String, args: js.Any*): js.Any
  def getPropertyPath(obj: js.Any, path: String): js.Any
  def inherits(ctor: js.Any, superCtor: js.Any): js.Any
  def isArray(value: js.Any): js.Any
  def isCasperObject(value: js.Any): js.Any
  def isClipRect(value: js.Any): js.Any
  def isFalsy(subject: js.Any): js.Any
  def isFunction(value: js.Any): js.Any
  def isJsFile(file: String): js.Any
  def isNull(value: js.Any): js.Any
  def isNumber(value: js.Any): js.Any
  def isObject(value: js.Any): js.Any
  def isRegExp(value: js.Any): js.Any
  def isString(value: js.Any): js.Any
  def isTruthy(subject: js.Any): js.Any
  def isType(what: js.Any, `type`: String): js.Any
  def isUndefined(value: js.Any): js.Any
  def isWebPage(what: js.Any): js.Any
  def mergeObjects(origin: js.Any, add: js.Any): js.Any
  def node(name: String, attributes: js.Any): js.Any
  def serialize(value: js.Any): js.Any
  def unique(array: js.Array[_]): js.Any
}

object Utils {
  @scala.inline
  def apply(
    betterTypeOf: js.Any => js.Any,
    dump: js.Any => js.Any,
    fileExt: String => js.Any,
    fillBlanks: (String, Double) => js.Any,
    format: (String, /* repeated */ js.Any) => js.Any,
    getPropertyPath: (js.Any, String) => js.Any,
    inherits: (js.Any, js.Any) => js.Any,
    isArray: js.Any => js.Any,
    isCasperObject: js.Any => js.Any,
    isClipRect: js.Any => js.Any,
    isFalsy: js.Any => js.Any,
    isFunction: js.Any => js.Any,
    isJsFile: String => js.Any,
    isNull: js.Any => js.Any,
    isNumber: js.Any => js.Any,
    isObject: js.Any => js.Any,
    isRegExp: js.Any => js.Any,
    isString: js.Any => js.Any,
    isTruthy: js.Any => js.Any,
    isType: (js.Any, String) => js.Any,
    isUndefined: js.Any => js.Any,
    isWebPage: js.Any => js.Any,
    mergeObjects: (js.Any, js.Any) => js.Any,
    node: (String, js.Any) => js.Any,
    serialize: js.Any => js.Any,
    unique: js.Array[_] => js.Any
  ): Utils = {
    val __obj = js.Dynamic.literal(betterTypeOf = js.Any.fromFunction1(betterTypeOf), dump = js.Any.fromFunction1(dump), fileExt = js.Any.fromFunction1(fileExt), fillBlanks = js.Any.fromFunction2(fillBlanks), format = js.Any.fromFunction2(format), getPropertyPath = js.Any.fromFunction2(getPropertyPath), inherits = js.Any.fromFunction2(inherits), isArray = js.Any.fromFunction1(isArray), isCasperObject = js.Any.fromFunction1(isCasperObject), isClipRect = js.Any.fromFunction1(isClipRect), isFalsy = js.Any.fromFunction1(isFalsy), isFunction = js.Any.fromFunction1(isFunction), isJsFile = js.Any.fromFunction1(isJsFile), isNull = js.Any.fromFunction1(isNull), isNumber = js.Any.fromFunction1(isNumber), isObject = js.Any.fromFunction1(isObject), isRegExp = js.Any.fromFunction1(isRegExp), isString = js.Any.fromFunction1(isString), isTruthy = js.Any.fromFunction1(isTruthy), isType = js.Any.fromFunction2(isType), isUndefined = js.Any.fromFunction1(isUndefined), isWebPage = js.Any.fromFunction1(isWebPage), mergeObjects = js.Any.fromFunction2(mergeObjects), node = js.Any.fromFunction2(node), serialize = js.Any.fromFunction1(serialize), unique = js.Any.fromFunction1(unique))
  
    __obj.asInstanceOf[Utils]
  }
}

