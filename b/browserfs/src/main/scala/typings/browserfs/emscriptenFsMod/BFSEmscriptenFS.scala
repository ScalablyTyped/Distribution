package typings.browserfs.emscriptenFsMod

import typings.browserfs.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BFSEmscriptenFS extends EmscriptenFS {
  
  var ERRNO_CODES: js.Any = js.native
  
  var FS: js.Any = js.native
  
  var PATH: js.Any = js.native
  
  def createNode(parent: Null, name: String, mode: Double): EmscriptenFSNode = js.native
  def createNode(parent: Null, name: String, mode: Double, dev: js.Any): EmscriptenFSNode = js.native
  
  def flagsToPermissionString(flags: String): String = js.native
  def flagsToPermissionString(flags: Double): String = js.native
  
  var flagsToPermissionStringMap: `0` = js.native
  
  def getERRNO_CODES(): js.Any = js.native
  
  def getFS(): js.Any = js.native
  
  def getNodeFS(): typings.browserfs.fSMod.default = js.native
  
  def getPATH(): js.Any = js.native
  
  var nodefs: js.Any = js.native
}
