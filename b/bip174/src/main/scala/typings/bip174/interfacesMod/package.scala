package typings.bip174

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object interfacesMod {
  
  type FinalScriptSig = typings.node.Buffer
  
  type FinalScriptWitness = typings.node.Buffer
  
  type NonWitnessUtxo = typings.node.Buffer
  
  type PorCommitment = java.lang.String
  
  type RedeemScript = typings.node.Buffer
  
  type SighashType = scala.Double
  
  type TransactionFromBuffer = js.Function1[/* buffer */ typings.node.Buffer, typings.bip174.interfacesMod.Transaction]
  
  type TransactionIOCountGetter = js.Function1[/* txBuffer */ typings.node.Buffer, typings.bip174.anon.InputCount]
  
  type TransactionInputAdder = js.Function2[
    /* input */ typings.bip174.interfacesMod.TransactionInput, 
    /* txBuffer */ typings.node.Buffer, 
    typings.node.Buffer
  ]
  
  type TransactionLocktimeSetter = js.Function2[/* locktime */ scala.Double, /* txBuffer */ typings.node.Buffer, typings.node.Buffer]
  
  type TransactionOutputAdder = js.Function2[
    /* output */ typings.bip174.interfacesMod.TransactionOutput, 
    /* txBuffer */ typings.node.Buffer, 
    typings.node.Buffer
  ]
  
  type TransactionVersionSetter = js.Function2[/* version */ scala.Double, /* txBuffer */ typings.node.Buffer, typings.node.Buffer]
  
  type WitnessScript = typings.node.Buffer
}
