package typings.bitcoinComputerLib

import typings.bitcoinComputerLib.mod.Chain
import typings.bitcoinComputerLib.mod.Network
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bitcoinComputerLibStrings {
  
  @js.native
  sealed trait ASC extends StObject
  inline def ASC: ASC = "ASC".asInstanceOf[ASC]
  
  @js.native
  sealed trait BTC
    extends StObject
       with Chain
  inline def BTC: BTC = "BTC".asInstanceOf[BTC]
  
  @js.native
  sealed trait DESC extends StObject
  inline def DESC: DESC = "DESC".asInstanceOf[DESC]
  
  @js.native
  sealed trait LTC
    extends StObject
       with Chain
  inline def LTC: LTC = "LTC".asInstanceOf[LTC]
  
  @js.native
  sealed trait livenet
    extends StObject
       with Network
  inline def livenet: livenet = "livenet".asInstanceOf[livenet]
  
  @js.native
  sealed trait mainnet
    extends StObject
       with Network
  inline def mainnet: mainnet = "mainnet".asInstanceOf[mainnet]
  
  @js.native
  sealed trait regtest
    extends StObject
       with Network
  inline def regtest: regtest = "regtest".asInstanceOf[regtest]
  
  @js.native
  sealed trait testnet
    extends StObject
       with Network
  inline def testnet: testnet = "testnet".asInstanceOf[testnet]
}
