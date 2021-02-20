package typings.bip174

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.PsbtGlobal
import typings.bip174.interfacesMod.PsbtGlobalUpdate
import typings.bip174.interfacesMod.PsbtInput
import typings.bip174.interfacesMod.PsbtInputUpdate
import typings.bip174.interfacesMod.PsbtOutput
import typings.bip174.interfacesMod.PsbtOutputUpdate
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("bip174/src/lib/utils", "addInputAttributes")
  @js.native
  def addInputAttributes(inputs: js.Array[PsbtInput], data: js.Any): Unit = js.native
  
  @JSImport("bip174/src/lib/utils", "addOutputAttributes")
  @js.native
  def addOutputAttributes(outputs: js.Array[PsbtOutput], data: js.Any): Unit = js.native
  
  @JSImport("bip174/src/lib/utils", "checkForInput")
  @js.native
  def checkForInput(inputs: js.Array[PsbtInput], inputIndex: Double): PsbtInput = js.native
  
  @JSImport("bip174/src/lib/utils", "checkForOutput")
  @js.native
  def checkForOutput(outputs: js.Array[PsbtOutput], outputIndex: Double): PsbtOutput = js.native
  
  @JSImport("bip174/src/lib/utils", "checkHasKey")
  @js.native
  def checkHasKey(checkKeyVal: KeyValue, keyVals: js.UndefOr[scala.Nothing], enumLength: Double): Unit = js.native
  @JSImport("bip174/src/lib/utils", "checkHasKey")
  @js.native
  def checkHasKey(checkKeyVal: KeyValue, keyVals: js.Array[KeyValue], enumLength: Double): Unit = js.native
  
  @JSImport("bip174/src/lib/utils", "defaultLocktimeSetter")
  @js.native
  def defaultLocktimeSetter(locktime: Double, txBuf: Buffer): Buffer = js.native
  
  @JSImport("bip174/src/lib/utils", "defaultVersionSetter")
  @js.native
  def defaultVersionSetter(version: Double, txBuf: Buffer): Buffer = js.native
  
  @JSImport("bip174/src/lib/utils", "getEnumLength")
  @js.native
  def getEnumLength(myenum: js.Any): Double = js.native
  
  @JSImport("bip174/src/lib/utils", "inputCheckUncleanFinalized")
  @js.native
  def inputCheckUncleanFinalized(inputIndex: Double, input: PsbtInput): Unit = js.native
  
  @JSImport("bip174/src/lib/utils", "updateGlobal")
  @js.native
  def updateGlobal(updateData: PsbtGlobalUpdate, mainData: PsbtGlobal): Unit = js.native
  
  @JSImport("bip174/src/lib/utils", "updateInput")
  @js.native
  def updateInput(updateData: PsbtInputUpdate, mainData: PsbtInput): Unit = js.native
  
  @JSImport("bip174/src/lib/utils", "updateOutput")
  @js.native
  def updateOutput(updateData: PsbtOutputUpdate, mainData: PsbtOutput): Unit = js.native
}
