package typings
package breezeLib.breezeNs.configNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.config")
@js.native
object ^ extends js.Object {
  var ajax: java.lang.String = js.native
  var dataService: java.lang.String = js.native
  var functionRegistry: js.Object = js.native
  var interfaceInitialized: stdLib.Event = js.native
  var interfaceRegistry: js.Object = js.native
  var objectRegistry: js.Object = js.native
  var stringifyPad: java.lang.String = js.native
  var typeRegistry: js.Object = js.native
  def getAdapter(interfaceName: java.lang.String): js.Function = js.native
  def getAdapter(interfaceName: java.lang.String, adapterName: java.lang.String): js.Function = js.native
  def getAdapterInstance(interfaceName: java.lang.String): js.Object = js.native
  def getAdapterInstance(interfaceName: java.lang.String, adapterName: java.lang.String): js.Object = js.native
  def initializeAdapterInstance(interfaceName: java.lang.String, adapterName: java.lang.String): js.Object = js.native
  def initializeAdapterInstance(interfaceName: java.lang.String, adapterName: java.lang.String, isDefault: scala.Boolean): js.Object = js.native
  def initializeAdapterInstances(config: AdapterInstancesConfig): js.Array[js.Object] = js.native
  def registerAdapter(interfaceName: java.lang.String, adapterCtor: js.Function): scala.Unit = js.native
  def registerFunction(fn: js.Function, fnName: java.lang.String): scala.Unit = js.native
  def registerType(ctor: js.Function, typeName: java.lang.String): scala.Unit = js.native
  def setQ(q: breezeLib.breezeNs.promisesNs.IPromiseService): scala.Unit = js.native
}

