package typings
package cfbLib.cfbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cfb", JSImport.Namespace)
@js.native
object cfbModMembers extends js.Object {
  val utils: CFB$Utils = js.native
  val version: java.lang.String = js.native
  def find(cfb: CFB$Container, path: java.lang.String): CFB$Entry | scala.Null = js.native
  def parse(f: CFB$Blob): CFB$Container = js.native
  def parse(f: CFB$Blob, options: CFB$ParsingOptions): CFB$Container = js.native
  def read(f: CFB$Blob): CFB$Container = js.native
  def read(f: CFB$Blob, options: CFB$ParsingOptions): CFB$Container = js.native
  def read(f: java.lang.String): CFB$Container = js.native
  def read(f: java.lang.String, options: CFB$ParsingOptions): CFB$Container = js.native
  def write(cfb: CFB$Container): js.Any = js.native
  def write(cfb: CFB$Container, options: CFB$WritingOptions): js.Any = js.native
  def writeFile(cfb: CFB$Container, filename: java.lang.String): js.Any = js.native
  def writeFile(cfb: CFB$Container, filename: java.lang.String, options: CFB$WritingOptions): js.Any = js.native
}

