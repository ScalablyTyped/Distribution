package typings
package casperjsLib.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils extends js.Object {
  def betterTypeOf(input: js.Any): js.Any
  def dump(value: js.Any): js.Any
  def fileExt(file: java.lang.String): js.Any
  def fillBlanks(text: java.lang.String, pad: scala.Double): js.Any
  def format(f: java.lang.String, args: js.Any*): js.Any
  def getPropertyPath(obj: js.Any, path: java.lang.String): js.Any
  def inherits(ctor: js.Any, superCtor: js.Any): js.Any
  def isArray(value: js.Any): js.Any
  def isCasperObject(value: js.Any): js.Any
  def isClipRect(value: js.Any): js.Any
  def isFalsy(subject: js.Any): js.Any
  def isFunction(value: js.Any): js.Any
  def isJsFile(file: java.lang.String): js.Any
  def isNull(value: js.Any): js.Any
  def isNumber(value: js.Any): js.Any
  def isObject(value: js.Any): js.Any
  def isRegExp(value: js.Any): js.Any
  def isString(value: js.Any): js.Any
  def isTruthy(subject: js.Any): js.Any
  def isType(what: js.Any, `type`: java.lang.String): js.Any
  def isUndefined(value: js.Any): js.Any
  def isWebPage(what: js.Any): js.Any
  def mergeObjects(origin: js.Any, add: js.Any): js.Any
  def node(name: java.lang.String, attributes: js.Any): js.Any
  def serialize(value: js.Any): js.Any
  def unique(array: js.Array[_]): js.Any
}

object Utils {
  @scala.inline
  def apply(
    betterTypeOf: js.Function1[js.Any, js.Any],
    dump: js.Function1[js.Any, js.Any],
    fileExt: js.Function1[java.lang.String, js.Any],
    fillBlanks: js.Function2[java.lang.String, scala.Double, js.Any],
    format: js.Function2[java.lang.String, /* repeated */ js.Any, js.Any],
    getPropertyPath: js.Function2[js.Any, java.lang.String, js.Any],
    inherits: js.Function2[js.Any, js.Any, js.Any],
    isArray: js.Function1[js.Any, js.Any],
    isCasperObject: js.Function1[js.Any, js.Any],
    isClipRect: js.Function1[js.Any, js.Any],
    isFalsy: js.Function1[js.Any, js.Any],
    isFunction: js.Function1[js.Any, js.Any],
    isJsFile: js.Function1[java.lang.String, js.Any],
    isNull: js.Function1[js.Any, js.Any],
    isNumber: js.Function1[js.Any, js.Any],
    isObject: js.Function1[js.Any, js.Any],
    isRegExp: js.Function1[js.Any, js.Any],
    isString: js.Function1[js.Any, js.Any],
    isTruthy: js.Function1[js.Any, js.Any],
    isType: js.Function2[js.Any, java.lang.String, js.Any],
    isUndefined: js.Function1[js.Any, js.Any],
    isWebPage: js.Function1[js.Any, js.Any],
    mergeObjects: js.Function2[js.Any, js.Any, js.Any],
    node: js.Function2[java.lang.String, js.Any, js.Any],
    serialize: js.Function1[js.Any, js.Any],
    unique: js.Function1[js.Array[_], js.Any]
  ): Utils = {
    val __obj = js.Dynamic.literal(betterTypeOf = betterTypeOf, dump = dump, fileExt = fileExt, fillBlanks = fillBlanks, format = format, getPropertyPath = getPropertyPath, inherits = inherits, isArray = isArray, isCasperObject = isCasperObject, isClipRect = isClipRect, isFalsy = isFalsy, isFunction = isFunction, isJsFile = isJsFile, isNull = isNull, isNumber = isNumber, isObject = isObject, isRegExp = isRegExp, isString = isString, isTruthy = isTruthy, isType = isType, isUndefined = isUndefined, isWebPage = isWebPage, mergeObjects = mergeObjects, node = node, serialize = serialize, unique = unique)
  
    __obj.asInstanceOf[Utils]
  }
}

