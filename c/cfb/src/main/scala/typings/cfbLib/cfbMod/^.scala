package typings
package cfbLib.cfbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cfb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val utils: cfbLib.cfbMod.CFB$Utils = js.native
  val version: java.lang.String = js.native
  def find(cfb: cfbLib.cfbMod.CFB$Container, path: java.lang.String): cfbLib.cfbMod.CFB$Entry | scala.Null = js.native
  def parse(f: cfbLib.cfbMod.CFB$Blob): cfbLib.cfbMod.CFB$Container = js.native
  def parse(f: cfbLib.cfbMod.CFB$Blob, options: cfbLib.cfbMod.CFB$ParsingOptions): cfbLib.cfbMod.CFB$Container = js.native
  def read(f: cfbLib.cfbMod.CFB$Blob): cfbLib.cfbMod.CFB$Container = js.native
  def read(f: cfbLib.cfbMod.CFB$Blob, options: cfbLib.cfbMod.CFB$ParsingOptions): cfbLib.cfbMod.CFB$Container = js.native
  def read(f: java.lang.String): cfbLib.cfbMod.CFB$Container = js.native
  def read(f: java.lang.String, options: cfbLib.cfbMod.CFB$ParsingOptions): cfbLib.cfbMod.CFB$Container = js.native
  def write(cfb: cfbLib.cfbMod.CFB$Container): js.Any = js.native
  def write(cfb: cfbLib.cfbMod.CFB$Container, options: cfbLib.cfbMod.CFB$WritingOptions): js.Any = js.native
  def writeFile(cfb: cfbLib.cfbMod.CFB$Container, filename: java.lang.String): js.Any = js.native
  def writeFile(
    cfb: cfbLib.cfbMod.CFB$Container,
    filename: java.lang.String,
    options: cfbLib.cfbMod.CFB$WritingOptions
  ): js.Any = js.native
}

