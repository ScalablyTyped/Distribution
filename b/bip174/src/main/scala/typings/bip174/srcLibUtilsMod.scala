package typings.bip174

import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.bip174.srcLibInterfacesMod.PsbtGlobal
import typings.bip174.srcLibInterfacesMod.PsbtGlobalUpdate
import typings.bip174.srcLibInterfacesMod.PsbtInput
import typings.bip174.srcLibInterfacesMod.PsbtInputUpdate
import typings.bip174.srcLibInterfacesMod.PsbtOutput
import typings.bip174.srcLibInterfacesMod.PsbtOutputUpdate
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibUtilsMod {
  
  @JSImport("bip174/src/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addInputAttributes(inputs: js.Array[PsbtInput], data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addInputAttributes")(inputs.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addOutputAttributes(outputs: js.Array[PsbtOutput], data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addOutputAttributes")(outputs.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkForInput(inputs: js.Array[PsbtInput], inputIndex: Double): PsbtInput = (^.asInstanceOf[js.Dynamic].applyDynamic("checkForInput")(inputs.asInstanceOf[js.Any], inputIndex.asInstanceOf[js.Any])).asInstanceOf[PsbtInput]
  
  inline def checkForOutput(outputs: js.Array[PsbtOutput], outputIndex: Double): PsbtOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("checkForOutput")(outputs.asInstanceOf[js.Any], outputIndex.asInstanceOf[js.Any])).asInstanceOf[PsbtOutput]
  
  inline def checkHasKey(checkKeyVal: KeyValue, keyVals: js.Array[KeyValue], enumLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkHasKey")(checkKeyVal.asInstanceOf[js.Any], keyVals.asInstanceOf[js.Any], enumLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkHasKey(checkKeyVal: KeyValue, keyVals: Unit, enumLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkHasKey")(checkKeyVal.asInstanceOf[js.Any], keyVals.asInstanceOf[js.Any], enumLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def defaultLocktimeSetter(locktime: Double, txBuf: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultLocktimeSetter")(locktime.asInstanceOf[js.Any], txBuf.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def defaultVersionSetter(version: Double, txBuf: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultVersionSetter")(version.asInstanceOf[js.Any], txBuf.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def getEnumLength(myenum: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnumLength")(myenum.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def inputCheckUncleanFinalized(inputIndex: Double, input: PsbtInput): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inputCheckUncleanFinalized")(inputIndex.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateGlobal(updateData: PsbtGlobalUpdate, mainData: PsbtGlobal): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateGlobal")(updateData.asInstanceOf[js.Any], mainData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateInput(updateData: PsbtInputUpdate, mainData: PsbtInput): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateInput")(updateData.asInstanceOf[js.Any], mainData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateOutput(updateData: PsbtOutputUpdate, mainData: PsbtOutput): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateOutput")(updateData.asInstanceOf[js.Any], mainData.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
