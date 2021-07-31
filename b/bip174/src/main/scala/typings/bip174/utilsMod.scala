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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("bip174/src/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addInputAttributes(inputs: js.Array[PsbtInput], data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addInputAttributes")(inputs.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def addOutputAttributes(outputs: js.Array[PsbtOutput], data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addOutputAttributes")(outputs.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def checkForInput(inputs: js.Array[PsbtInput], inputIndex: Double): PsbtInput = (^.asInstanceOf[js.Dynamic].applyDynamic("checkForInput")(inputs.asInstanceOf[js.Any], inputIndex.asInstanceOf[js.Any])).asInstanceOf[PsbtInput]
  
  @scala.inline
  def checkForOutput(outputs: js.Array[PsbtOutput], outputIndex: Double): PsbtOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("checkForOutput")(outputs.asInstanceOf[js.Any], outputIndex.asInstanceOf[js.Any])).asInstanceOf[PsbtOutput]
  
  @scala.inline
  def checkHasKey(checkKeyVal: KeyValue, keyVals: js.Array[KeyValue], enumLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkHasKey")(checkKeyVal.asInstanceOf[js.Any], keyVals.asInstanceOf[js.Any], enumLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def checkHasKey(checkKeyVal: KeyValue, keyVals: Unit, enumLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkHasKey")(checkKeyVal.asInstanceOf[js.Any], keyVals.asInstanceOf[js.Any], enumLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def defaultLocktimeSetter(locktime: Double, txBuf: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultLocktimeSetter")(locktime.asInstanceOf[js.Any], txBuf.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def defaultVersionSetter(version: Double, txBuf: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultVersionSetter")(version.asInstanceOf[js.Any], txBuf.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def getEnumLength(myenum: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnumLength")(myenum.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def inputCheckUncleanFinalized(inputIndex: Double, input: PsbtInput): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inputCheckUncleanFinalized")(inputIndex.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def updateGlobal(updateData: PsbtGlobalUpdate, mainData: PsbtGlobal): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateGlobal")(updateData.asInstanceOf[js.Any], mainData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def updateInput(updateData: PsbtInputUpdate, mainData: PsbtInput): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateInput")(updateData.asInstanceOf[js.Any], mainData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def updateOutput(updateData: PsbtOutputUpdate, mainData: PsbtOutput): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateOutput")(updateData.asInstanceOf[js.Any], mainData.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
