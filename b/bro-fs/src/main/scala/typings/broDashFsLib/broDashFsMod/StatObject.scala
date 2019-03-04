package typings
package broDashFsLib.broDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatObject extends js.Object {
  var fullPath: java.lang.String
  var isDirectory: scala.Boolean
  var isFile: scala.Boolean
  var modificationTime: stdLib.Date
  var name: java.lang.String
  var size: scala.Double
}

object StatObject {
  @scala.inline
  def apply(
    fullPath: java.lang.String,
    isDirectory: scala.Boolean,
    isFile: scala.Boolean,
    modificationTime: stdLib.Date,
    name: java.lang.String,
    size: scala.Double
  ): StatObject = {
    val __obj = js.Dynamic.literal(fullPath = fullPath, isDirectory = isDirectory, isFile = isFile, modificationTime = modificationTime, name = name, size = size)
  
    __obj.asInstanceOf[StatObject]
  }
}

