package typings.convertDashUnits

import typings.convertDashUnits.convertDashUnitsMod.Convert
import typings.convertDashUnits.convertDashUnitsMod.measure
import typings.convertDashUnits.convertDashUnitsMod.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("convert-units", JSImport.Namespace)
@js.native
object convertDashUnitsMod extends js.Object {
  @js.native
  trait Convert extends js.Object {
    def describe[T /* <: unit */](abbr: T): Anon_AbbrMeasure[T] = js.native
    def from(from: unit): this.type = js.native
    def getUnit[T /* <: unit */](abbr: T): Anon_Abbr[T] = js.native
    def list(): js.Array[unit] = js.native
    def list(measure: measure): js.Array[unit] = js.native
    def measures(): js.Array[measure] = js.native
    def possibilities(): js.Array[unit] = js.native
    def possibilities(measure: measure): js.Array[unit] = js.native
    /* private */ def throwUnsupportedUnitError(what: String): Unit = js.native
    def to(to: unit): Double = js.native
    def toBest(): Anon_Plural = js.native
    def toBest(options: Anon_CutOffNumber): Anon_Plural = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.distance
    - typings.convertDashUnits.convertDashUnitsStrings.area
    - typings.convertDashUnits.convertDashUnitsStrings.mass
    - typings.convertDashUnits.convertDashUnitsStrings.volume
    - typings.convertDashUnits.convertDashUnitsStrings.volumeFlowRate
    - typings.convertDashUnits.convertDashUnitsStrings.temperature
    - typings.convertDashUnits.convertDashUnitsStrings.time
    - typings.convertDashUnits.convertDashUnitsStrings.frequency
    - typings.convertDashUnits.convertDashUnitsStrings.speed
    - typings.convertDashUnits.convertDashUnitsStrings.pace
    - typings.convertDashUnits.convertDashUnitsStrings.pressure
    - typings.convertDashUnits.convertDashUnitsStrings.ditgital
    - typings.convertDashUnits.convertDashUnitsStrings.illuminance
    - typings.convertDashUnits.convertDashUnitsStrings.partsPer
    - typings.convertDashUnits.convertDashUnitsStrings.voltage
    - typings.convertDashUnits.convertDashUnitsStrings.current
    - typings.convertDashUnits.convertDashUnitsStrings.power
    - typings.convertDashUnits.convertDashUnitsStrings.apparentPower
    - typings.convertDashUnits.convertDashUnitsStrings.reactivePower
    - typings.convertDashUnits.convertDashUnitsStrings.energy
    - typings.convertDashUnits.convertDashUnitsStrings.reactiveEnergy
    - typings.convertDashUnits.convertDashUnitsStrings.angle
  */
  trait measure extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.metric
    - typings.convertDashUnits.convertDashUnitsStrings.imperial
    - typings.convertDashUnits.convertDashUnitsStrings.bits
    - typings.convertDashUnits.convertDashUnitsStrings.bytes
  */
  trait system extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.deg
    - typings.convertDashUnits.convertDashUnitsStrings.rad
    - typings.convertDashUnits.convertDashUnitsStrings.grad
    - typings.convertDashUnits.convertDashUnitsStrings.arcmin
    - typings.convertDashUnits.convertDashUnitsStrings.arcsec
  */
  trait uAngle extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.VA
    - typings.convertDashUnits.convertDashUnitsStrings.mVA
    - typings.convertDashUnits.convertDashUnitsStrings.kVA
    - typings.convertDashUnits.convertDashUnitsStrings.MVA
    - typings.convertDashUnits.convertDashUnitsStrings.GVA
  */
  trait uApparentPower extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.mm2
    - typings.convertDashUnits.convertDashUnitsStrings.cm2
    - typings.convertDashUnits.convertDashUnitsStrings.m2
    - typings.convertDashUnits.convertDashUnitsStrings.ha
    - typings.convertDashUnits.convertDashUnitsStrings.km2
    - typings.convertDashUnits.convertDashUnitsStrings.in2
    - typings.convertDashUnits.convertDashUnitsStrings.ft2
    - typings.convertDashUnits.convertDashUnitsStrings.ac
    - typings.convertDashUnits.convertDashUnitsStrings.mi2
  */
  trait uArea extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.A
    - typings.convertDashUnits.convertDashUnitsStrings.mA
    - typings.convertDashUnits.convertDashUnitsStrings.kA
  */
  trait uCurrent extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.mm
    - typings.convertDashUnits.convertDashUnitsStrings.cm
    - typings.convertDashUnits.convertDashUnitsStrings.m
    - typings.convertDashUnits.convertDashUnitsStrings.km
    - typings.convertDashUnits.convertDashUnitsStrings.in
    - typings.convertDashUnits.convertDashUnitsStrings.`ft-us`
    - typings.convertDashUnits.convertDashUnitsStrings.ft
    - typings.convertDashUnits.convertDashUnitsStrings.mi
  */
  trait uDistance extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.b
    - typings.convertDashUnits.convertDashUnitsStrings.Kb
    - typings.convertDashUnits.convertDashUnitsStrings.Mb
    - typings.convertDashUnits.convertDashUnitsStrings.Gb
    - typings.convertDashUnits.convertDashUnitsStrings.Tb
    - typings.convertDashUnits.convertDashUnitsStrings.B
    - typings.convertDashUnits.convertDashUnitsStrings.KB
    - typings.convertDashUnits.convertDashUnitsStrings.MB
    - typings.convertDashUnits.convertDashUnitsStrings.GB
    - typings.convertDashUnits.convertDashUnitsStrings.TB
  */
  trait uDitgital extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.Wh
    - typings.convertDashUnits.convertDashUnitsStrings.mWh
    - typings.convertDashUnits.convertDashUnitsStrings.kWh
    - typings.convertDashUnits.convertDashUnitsStrings.MWh
    - typings.convertDashUnits.convertDashUnitsStrings.GWh
    - typings.convertDashUnits.convertDashUnitsStrings.J
    - typings.convertDashUnits.convertDashUnitsStrings.kJ
  */
  trait uEnergy extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.Hz
    - typings.convertDashUnits.convertDashUnitsStrings.mHz
    - typings.convertDashUnits.convertDashUnitsStrings.kHz
    - typings.convertDashUnits.convertDashUnitsStrings.MHz
    - typings.convertDashUnits.convertDashUnitsStrings.GHz
    - typings.convertDashUnits.convertDashUnitsStrings.THz
    - typings.convertDashUnits.convertDashUnitsStrings.rpm
    - typings.convertDashUnits.convertDashUnitsStrings.`deg/s`
    - typings.convertDashUnits.convertDashUnitsStrings.`rad/s`
  */
  trait uFrequency extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.lx
    - typings.convertDashUnits.convertDashUnitsStrings.`ft-cd`
  */
  trait uIlluminance extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.mcg
    - typings.convertDashUnits.convertDashUnitsStrings.mg
    - typings.convertDashUnits.convertDashUnitsStrings.g
    - typings.convertDashUnits.convertDashUnitsStrings.kg
    - typings.convertDashUnits.convertDashUnitsStrings.oz
    - typings.convertDashUnits.convertDashUnitsStrings.lb
    - typings.convertDashUnits.convertDashUnitsStrings.mt
    - typings.convertDashUnits.convertDashUnitsStrings.t
  */
  trait uMass extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.`s/m`
    - typings.convertDashUnits.convertDashUnitsStrings.`min/km`
    - typings.convertDashUnits.convertDashUnitsStrings.`s/ft`
  */
  trait uPace extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.ppm
    - typings.convertDashUnits.convertDashUnitsStrings.ppb
    - typings.convertDashUnits.convertDashUnitsStrings.ppt
    - typings.convertDashUnits.convertDashUnitsStrings.ppq
  */
  trait uPartsPer extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.W
    - typings.convertDashUnits.convertDashUnitsStrings.mW
    - typings.convertDashUnits.convertDashUnitsStrings.kM
    - typings.convertDashUnits.convertDashUnitsStrings.MW
    - typings.convertDashUnits.convertDashUnitsStrings.GW
  */
  trait uPower extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.Pa
    - typings.convertDashUnits.convertDashUnitsStrings.hPa
    - typings.convertDashUnits.convertDashUnitsStrings.kPa
    - typings.convertDashUnits.convertDashUnitsStrings.MPa
    - typings.convertDashUnits.convertDashUnitsStrings.bar
    - typings.convertDashUnits.convertDashUnitsStrings.torr
    - typings.convertDashUnits.convertDashUnitsStrings.psi
    - typings.convertDashUnits.convertDashUnitsStrings.ksi
  */
  trait uPressure extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.VARh
    - typings.convertDashUnits.convertDashUnitsStrings.mVARh
    - typings.convertDashUnits.convertDashUnitsStrings.kVARh
    - typings.convertDashUnits.convertDashUnitsStrings.MVARh
    - typings.convertDashUnits.convertDashUnitsStrings.GVARH
  */
  trait uReactiveEnergy extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.VAR
    - typings.convertDashUnits.convertDashUnitsStrings.mVAR
    - typings.convertDashUnits.convertDashUnitsStrings.kVAR
    - typings.convertDashUnits.convertDashUnitsStrings.MVAR
    - typings.convertDashUnits.convertDashUnitsStrings.GVAR
  */
  trait uReactivePower extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.`m/s`
    - typings.convertDashUnits.convertDashUnitsStrings.`km/h`
    - typings.convertDashUnits.convertDashUnitsStrings.`m/h`
    - typings.convertDashUnits.convertDashUnitsStrings.knot
    - typings.convertDashUnits.convertDashUnitsStrings.`ft/s`
  */
  trait uSpeed extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.C
    - typings.convertDashUnits.convertDashUnitsStrings.F
    - typings.convertDashUnits.convertDashUnitsStrings.K
    - typings.convertDashUnits.convertDashUnitsStrings.R
  */
  trait uTemperature extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.ns
    - typings.convertDashUnits.convertDashUnitsStrings.mu
    - typings.convertDashUnits.convertDashUnitsStrings.ms
    - typings.convertDashUnits.convertDashUnitsStrings.s
    - typings.convertDashUnits.convertDashUnitsStrings.min
    - typings.convertDashUnits.convertDashUnitsStrings.h
    - typings.convertDashUnits.convertDashUnitsStrings.d
    - typings.convertDashUnits.convertDashUnitsStrings.week
    - typings.convertDashUnits.convertDashUnitsStrings.month
    - typings.convertDashUnits.convertDashUnitsStrings.year
  */
  trait uTime extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.V
    - typings.convertDashUnits.convertDashUnitsStrings.mV
    - typings.convertDashUnits.convertDashUnitsStrings.kV
  */
  trait uVoltage extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.mm3
    - typings.convertDashUnits.convertDashUnitsStrings.cm3
    - typings.convertDashUnits.convertDashUnitsStrings.ml
    - typings.convertDashUnits.convertDashUnitsStrings.l
    - typings.convertDashUnits.convertDashUnitsStrings.kl
    - typings.convertDashUnits.convertDashUnitsStrings.m3
    - typings.convertDashUnits.convertDashUnitsStrings.km3
    - typings.convertDashUnits.convertDashUnitsStrings.tsp
    - typings.convertDashUnits.convertDashUnitsStrings.Tbs
    - typings.convertDashUnits.convertDashUnitsStrings.in3
    - typings.convertDashUnits.convertDashUnitsStrings.`fl-oz`
    - typings.convertDashUnits.convertDashUnitsStrings.cup
    - typings.convertDashUnits.convertDashUnitsStrings.pnt
    - typings.convertDashUnits.convertDashUnitsStrings.qt
    - typings.convertDashUnits.convertDashUnitsStrings.gal
    - typings.convertDashUnits.convertDashUnitsStrings.ft3
    - typings.convertDashUnits.convertDashUnitsStrings.yd3
  */
  trait uVolume extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsStrings.`mm3/s`
    - typings.convertDashUnits.convertDashUnitsStrings.`cm3/s`
    - typings.convertDashUnits.convertDashUnitsStrings.`ml/s`
    - typings.convertDashUnits.convertDashUnitsStrings.`cl/s`
    - typings.convertDashUnits.convertDashUnitsStrings.`dl/s`
    - typings.convertDashUnits.convertDashUnitsStrings.`l/s`
    - typings.convertDashUnits.convertDashUnitsStrings.`l/min`
    - typings.convertDashUnits.convertDashUnitsStrings.`l/h`
    - typings.convertDashUnits.convertDashUnitsStrings.`kl/s`
    - typings.convertDashUnits.convertDashUnitsStrings.`kl/min`
    - typings.convertDashUnits.convertDashUnitsStrings.`kl/h`
    - typings.convertDashUnits.convertDashUnitsStrings.`m3/s`
    - typings.convertDashUnits.convertDashUnitsStrings.`m3/min`
    - typings.convertDashUnits.convertDashUnitsStrings.`m3/h`
    - typings.convertDashUnits.convertDashUnitsStrings.`km3/s`
    - typings.convertDashUnits.convertDashUnitsStrings.`tsp/s`
    - typings.convertDashUnits.convertDashUnitsStrings.`Tbs/s`
    - typings.convertDashUnits.convertDashUnitsStrings.`in3/s`
    - typings.convertDashUnits.convertDashUnitsStrings.`in3/min`
    - typings.convertDashUnits.convertDashUnitsStrings.`in3/h`
    - typings.convertDashUnits.convertDashUnitsStrings.`fl-oz/s`
    - typings.convertDashUnits.convertDashUnitsStrings.`fl-oz/min`
    - typings.convertDashUnits.convertDashUnitsStrings.`fl-oz/h`
    - typings.convertDashUnits.convertDashUnitsStrings.`cup/s`
    - typings.convertDashUnits.convertDashUnitsStrings.`pnt/s`
    - typings.convertDashUnits.convertDashUnitsStrings.`pnt/min`
    - typings.convertDashUnits.convertDashUnitsStrings.`pnt/h`
    - typings.convertDashUnits.convertDashUnitsStrings.`qt/s`
    - typings.convertDashUnits.convertDashUnitsStrings.`gal/s`
    - typings.convertDashUnits.convertDashUnitsStrings.`gal/min`
    - typings.convertDashUnits.convertDashUnitsStrings.`gal/h`
    - typings.convertDashUnits.convertDashUnitsStrings.`ft3/s`
    - typings.convertDashUnits.convertDashUnitsStrings.`ft3/min`
    - typings.convertDashUnits.convertDashUnitsStrings.`ft3/h`
    - typings.convertDashUnits.convertDashUnitsStrings.`yd3/s`
    - typings.convertDashUnits.convertDashUnitsStrings.`yd3/min`
    - typings.convertDashUnits.convertDashUnitsStrings.`yd3/h`
  */
  trait uVolumeFlowRate extends unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.convertDashUnits.convertDashUnitsMod.uDistance
    - typings.convertDashUnits.convertDashUnitsMod.uArea
    - typings.convertDashUnits.convertDashUnitsMod.uMass
    - typings.convertDashUnits.convertDashUnitsMod.uVolume
    - typings.convertDashUnits.convertDashUnitsMod.uVolumeFlowRate
    - typings.convertDashUnits.convertDashUnitsMod.uTemperature
    - typings.convertDashUnits.convertDashUnitsMod.uTime
    - typings.convertDashUnits.convertDashUnitsMod.uFrequency
    - typings.convertDashUnits.convertDashUnitsMod.uSpeed
    - typings.convertDashUnits.convertDashUnitsMod.uPace
    - typings.convertDashUnits.convertDashUnitsMod.uPressure
    - typings.convertDashUnits.convertDashUnitsMod.uDitgital
    - typings.convertDashUnits.convertDashUnitsMod.uIlluminance
    - typings.convertDashUnits.convertDashUnitsMod.uPartsPer
    - typings.convertDashUnits.convertDashUnitsMod.uVoltage
    - typings.convertDashUnits.convertDashUnitsMod.uCurrent
    - typings.convertDashUnits.convertDashUnitsMod.uPower
    - typings.convertDashUnits.convertDashUnitsMod.uApparentPower
    - typings.convertDashUnits.convertDashUnitsMod.uReactivePower
    - typings.convertDashUnits.convertDashUnitsMod.uEnergy
    - typings.convertDashUnits.convertDashUnitsMod.uReactiveEnergy
    - typings.convertDashUnits.convertDashUnitsMod.uAngle
  */
  trait unit extends js.Object
  
  def apply(value: Double): Convert = js.native
}

