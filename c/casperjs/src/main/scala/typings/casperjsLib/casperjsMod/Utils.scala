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

