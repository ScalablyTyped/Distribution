package typings.bitcoinComputerLib.mod

import typings.bitcoinComputerLib.anon.DataPrefix
import typings.bitcoinComputerLib.anon.PartialProgramMetaData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tx extends StObject {
  
  def createDataOuts(objects: js.Array[PartialProgramMetaData]): Unit = js.native
  def createDataOuts(objects: js.Array[PartialProgramMetaData], restClient: RestClient): Unit = js.native
  
  def dataPrefix: String = js.native
  
  def encoding: DataPrefix = js.native
  
  def getAmounts(): js.Array[Double] = js.native
  
  def getDataOutputs(): Any = js.native
  
  def getOutData(restClient: RestClient): js.Promise[js.Array[Data]] = js.native
  
  def getOwnerOutputs(): Any = js.native
  
  def getOwners(): js.Array[js.Array[String]] = js.native
  
  def inRevs: js.Array[String] = js.native
  
  def inputs: js.Array[String] = js.native
  
  def inputsLength: Double = js.native
  
  def ioDescriptor: js.Array[Double] = js.native
  
  def isBcTx(chain: Chain, network: Network): Boolean = js.native
  
  def maxDataIndex: Double = js.native
  
  var outData: js.Array[Data] = js.native
  
  def outRevs: js.Array[String] = js.native
  
  def outputsLength: Double = js.native
  
  def ownerInputs: js.Array[Any] = js.native
  
  def ownerOutputs: js.Array[Any] = js.native
  
  def spendFromData(inputRevs: js.Array[String], restClient: RestClient): js.Promise[Unit] = js.native
  
  var tx: Any = js.native
  
  def txId: String = js.native
  
  def zip: js.Array[js.Array[String]] = js.native
}
