package typings.breeze.breezeMod

import typings.breeze.breezeNs.configNs.AdapterInstancesConfig
import typings.breeze.breezeNs.promisesNs.IPromiseService
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "config")
@js.native
object configNs extends js.Object {
  var ajax: String = js.native
  var dataService: String = js.native
  var functionRegistry: js.Object = js.native
  var interfaceInitialized: Event = js.native
  var interfaceRegistry: js.Object = js.native
  var objectRegistry: js.Object = js.native
  var stringifyPad: String = js.native
  var typeRegistry: js.Object = js.native
  def getAdapter(interfaceName: String): js.Function = js.native
  def getAdapter(interfaceName: String, adapterName: String): js.Function = js.native
  def getAdapterInstance(interfaceName: String): js.Object = js.native
  def getAdapterInstance(interfaceName: String, adapterName: String): js.Object = js.native
  def initializeAdapterInstance(interfaceName: String, adapterName: String): js.Object = js.native
  def initializeAdapterInstance(interfaceName: String, adapterName: String, isDefault: Boolean): js.Object = js.native
  def initializeAdapterInstances(config: AdapterInstancesConfig): js.Array[js.Object] = js.native
  def registerAdapter(interfaceName: String, adapterCtor: js.Function): Unit = js.native
  def registerFunction(fn: js.Function, fnName: String): Unit = js.native
  def registerType(ctor: js.Function, typeName: String): Unit = js.native
  def setQ(q: IPromiseService): Unit = js.native
}

