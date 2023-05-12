package typings.dadataApi

import typings.dadataApi.mod.DaDataApi.AddressBeltwayHit
import typings.dadataApi.mod.DaDataApi.AddressBounds
import typings.dadataApi.mod.DaDataApi.BankStatus
import typings.dadataApi.mod.DaDataApi.BankType
import typings.dadataApi.mod.DaDataApi.Gender
import typings.dadataApi.mod.DaDataApi.PartyBranchType
import typings.dadataApi.mod.DaDataApi.PartyStatus
import typings.dadataApi.mod.DaDataApi.PartyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dadataApiStrings {
  
  @js.native
  sealed trait `0` extends StObject
  inline def `0`: `0` = "0".asInstanceOf[`0`]
  
  @js.native
  sealed trait `1` extends StObject
  inline def `1`: `1` = "1".asInstanceOf[`1`]
  
  @js.native
  sealed trait `2` extends StObject
  inline def `2`: `2` = "2".asInstanceOf[`2`]
  
  @js.native
  sealed trait `3` extends StObject
  inline def `3`: `3` = "3".asInstanceOf[`3`]
  
  @js.native
  sealed trait `4` extends StObject
  inline def `4`: `4` = "4".asInstanceOf[`4`]
  
  @js.native
  sealed trait `5` extends StObject
  inline def `5`: `5` = "5".asInstanceOf[`5`]
  
  @js.native
  sealed trait ACTIVE
    extends StObject
       with BankStatus
       with PartyStatus
  inline def ACTIVE: ACTIVE = "ACTIVE".asInstanceOf[ACTIVE]
  
  @js.native
  sealed trait BANK
    extends StObject
       with BankType
  inline def BANK: BANK = "BANK".asInstanceOf[BANK]
  
  @js.native
  sealed trait BANKRUPT
    extends StObject
       with PartyStatus
  inline def BANKRUPT: BANKRUPT = "BANKRUPT".asInstanceOf[BANKRUPT]
  
  @js.native
  sealed trait BANK_BRANCH
    extends StObject
       with BankType
  inline def BANK_BRANCH: BANK_BRANCH = "BANK_BRANCH".asInstanceOf[BANK_BRANCH]
  
  @js.native
  sealed trait BRANCH
    extends StObject
       with PartyBranchType
  inline def BRANCH: BRANCH = "BRANCH".asInstanceOf[BRANCH]
  
  @js.native
  sealed trait FEMALE
    extends StObject
       with Gender
  inline def FEMALE: FEMALE = "FEMALE".asInstanceOf[FEMALE]
  
  @js.native
  sealed trait INDIVIDUAL
    extends StObject
       with PartyType
  inline def INDIVIDUAL: INDIVIDUAL = "INDIVIDUAL".asInstanceOf[INDIVIDUAL]
  
  @js.native
  sealed trait IN_KAD
    extends StObject
       with AddressBeltwayHit
  inline def IN_KAD: IN_KAD = "IN_KAD".asInstanceOf[IN_KAD]
  
  @js.native
  sealed trait IN_MKAD
    extends StObject
       with AddressBeltwayHit
  inline def IN_MKAD: IN_MKAD = "IN_MKAD".asInstanceOf[IN_MKAD]
  
  @js.native
  sealed trait LEGAL
    extends StObject
       with PartyType
  inline def LEGAL: LEGAL = "LEGAL".asInstanceOf[LEGAL]
  
  @js.native
  sealed trait LIQUIDATED
    extends StObject
       with BankStatus
       with PartyStatus
  inline def LIQUIDATED: LIQUIDATED = "LIQUIDATED".asInstanceOf[LIQUIDATED]
  
  @js.native
  sealed trait LIQUIDATING
    extends StObject
       with BankStatus
       with PartyStatus
  inline def LIQUIDATING: LIQUIDATING = "LIQUIDATING".asInstanceOf[LIQUIDATING]
  
  @js.native
  sealed trait MAIN
    extends StObject
       with PartyBranchType
  inline def MAIN: MAIN = "MAIN".asInstanceOf[MAIN]
  
  @js.native
  sealed trait MALE
    extends StObject
       with Gender
  inline def MALE: MALE = "MALE".asInstanceOf[MALE]
  
  @js.native
  sealed trait NKO
    extends StObject
       with BankType
  inline def NKO: NKO = "NKO".asInstanceOf[NKO]
  
  @js.native
  sealed trait NKO_BRANCH
    extends StObject
       with BankType
  inline def NKO_BRANCH: NKO_BRANCH = "NKO_BRANCH".asInstanceOf[NKO_BRANCH]
  
  @js.native
  sealed trait OTHER
    extends StObject
       with BankType
  inline def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  
  @js.native
  sealed trait OUT_KAD
    extends StObject
       with AddressBeltwayHit
  inline def OUT_KAD: OUT_KAD = "OUT_KAD".asInstanceOf[OUT_KAD]
  
  @js.native
  sealed trait OUT_MKAD
    extends StObject
       with AddressBeltwayHit
  inline def OUT_MKAD: OUT_MKAD = "OUT_MKAD".asInstanceOf[OUT_MKAD]
  
  @js.native
  sealed trait REORGANIZING
    extends StObject
       with PartyStatus
  inline def REORGANIZING: REORGANIZING = "REORGANIZING".asInstanceOf[REORGANIZING]
  
  @js.native
  sealed trait RKC
    extends StObject
       with BankType
  inline def RKC: RKC = "RKC".asInstanceOf[RKC]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with Gender
  inline def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait area
    extends StObject
       with AddressBounds
  inline def area: area = "area".asInstanceOf[area]
  
  @js.native
  sealed trait city
    extends StObject
       with AddressBounds
  inline def city: city = "city".asInstanceOf[city]
  
  @js.native
  sealed trait country
    extends StObject
       with AddressBounds
  inline def country: country = "country".asInstanceOf[country]
  
  @js.native
  sealed trait houses
    extends StObject
       with AddressBounds
  inline def houses: houses = "houses".asInstanceOf[houses]
  
  @js.native
  sealed trait region
    extends StObject
       with AddressBounds
  inline def region: region = "region".asInstanceOf[region]
  
  @js.native
  sealed trait settlement
    extends StObject
       with AddressBounds
  inline def settlement: settlement = "settlement".asInstanceOf[settlement]
  
  @js.native
  sealed trait street
    extends StObject
       with AddressBounds
  inline def street: street = "street".asInstanceOf[street]
}
