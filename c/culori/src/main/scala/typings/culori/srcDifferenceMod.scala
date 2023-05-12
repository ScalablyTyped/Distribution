package typings.culori

import typings.culori.anon.CH
import typings.culori.anon.HNumber
import typings.culori.anon.S
import typings.culori.srcCommonMod.Color
import typings.culori.srcCommonMod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDifferenceMod {
  
  @JSImport("culori/src/difference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def differenceCie76(): DiffFn = ^.asInstanceOf[js.Dynamic].applyDynamic("differenceCie76")().asInstanceOf[DiffFn]
  
  inline def differenceCie94(): DiffFn = ^.asInstanceOf[js.Dynamic].applyDynamic("differenceCie94")().asInstanceOf[DiffFn]
  inline def differenceCie94(kL: Double): DiffFn = ^.asInstanceOf[js.Dynamic].applyDynamic("differenceCie94")(kL.asInstanceOf[js.Any]).asInstanceOf[DiffFn]
  inline def differenceCie94(kL: Double, K1: Double): DiffFn = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceCie94")(kL.asInstanceOf[js.Any], K1.asInstanceOf[js.Any])).asInstanceOf[DiffFn]
  inline def differenceCie94(kL: Double, K1: Double, K2: Double): DiffFn = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceCie94")(kL.asInstanceOf[js.Any], K1.asInstanceOf[js.Any], K2.asInstanceOf[js.Any])).asInstanceOf[DiffFn]
  inline def differenceCie94(kL: Double, K1: Unit, K2: Double): DiffFn = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceCie94")(kL.asInstanceOf[js.Any], K1.asInstanceOf[js.Any], K2.asInstanceOf[js.Any])).asInstanceOf[DiffFn]
  inline def differenceCie94(kL: Unit, K1: Double): DiffFn = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceCie94")(kL.asInstanceOf[js.Any], K1.asInstanceOf[js.Any])).asInstanceOf[DiffFn]
  inline def differenceCie94(kL: Unit, K1: Double, K2: Double): DiffFn = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceCie94")(kL.asInstanceOf[js.Any], K1.asInstanceOf[js.Any], K2.asInstanceOf[js.Any])).asInstanceOf[DiffFn]
  inline def differenceCie94(kL: Unit, K1: Unit, K2: Double): DiffFn = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceCie94")(kL.asInstanceOf[js.Any], K1.asInstanceOf[js.Any], K2.asInstanceOf[js.Any])).asInstanceOf[DiffFn]
  
  inline def differenceCiede2000(): DiffFn = ^.asInstanceOf[js.Dynamic].applyDynamic("differenceCiede2000")().asInstanceOf[DiffFn]
  inline def differenceCiede2000(Kl: Double): DiffFn = ^.asInstanceOf[js.Dynamic].applyDynamic("differenceCiede2000")(Kl.asInstanceOf[js.Any]).asInstanceOf[DiffFn]
  inline def differenceCiede2000(Kl: Double, Kc: Double): DiffFn = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceCiede2000")(Kl.asInstanceOf[js.Any], Kc.asInstanceOf[js.Any])).asInstanceOf[DiffFn]
  inline def differenceCiede2000(Kl: Double, Kc: Double, Kh: Double): DiffFn = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceCiede2000")(Kl.asInstanceOf[js.Any], Kc.asInstanceOf[js.Any], Kh.asInstanceOf[js.Any])).asInstanceOf[DiffFn]
  inline def differenceCiede2000(Kl: Double, Kc: Unit, Kh: Double): DiffFn = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceCiede2000")(Kl.asInstanceOf[js.Any], Kc.asInstanceOf[js.Any], Kh.asInstanceOf[js.Any])).asInstanceOf[DiffFn]
  inline def differenceCiede2000(Kl: Unit, Kc: Double): DiffFn = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceCiede2000")(Kl.asInstanceOf[js.Any], Kc.asInstanceOf[js.Any])).asInstanceOf[DiffFn]
  inline def differenceCiede2000(Kl: Unit, Kc: Double, Kh: Double): DiffFn = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceCiede2000")(Kl.asInstanceOf[js.Any], Kc.asInstanceOf[js.Any], Kh.asInstanceOf[js.Any])).asInstanceOf[DiffFn]
  inline def differenceCiede2000(Kl: Unit, Kc: Unit, Kh: Double): DiffFn = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceCiede2000")(Kl.asInstanceOf[js.Any], Kc.asInstanceOf[js.Any], Kh.asInstanceOf[js.Any])).asInstanceOf[DiffFn]
  
  inline def differenceCmc(): DiffFn = ^.asInstanceOf[js.Dynamic].applyDynamic("differenceCmc")().asInstanceOf[DiffFn]
  inline def differenceCmc(l: Double): DiffFn = ^.asInstanceOf[js.Dynamic].applyDynamic("differenceCmc")(l.asInstanceOf[js.Any]).asInstanceOf[DiffFn]
  inline def differenceCmc(l: Double, c: Double): DiffFn = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceCmc")(l.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[DiffFn]
  inline def differenceCmc(l: Unit, c: Double): DiffFn = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceCmc")(l.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[DiffFn]
  
  inline def differenceEuclidean(): DiffFn = ^.asInstanceOf[js.Dynamic].applyDynamic("differenceEuclidean")().asInstanceOf[DiffFn]
  inline def differenceEuclidean(mode: Unit, weights: js.Tuple4[Double, Double, Double, Double]): DiffFn = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceEuclidean")(mode.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[DiffFn]
  inline def differenceEuclidean(mode: Mode): DiffFn = ^.asInstanceOf[js.Dynamic].applyDynamic("differenceEuclidean")(mode.asInstanceOf[js.Any]).asInstanceOf[DiffFn]
  inline def differenceEuclidean(mode: Mode, weights: js.Tuple4[Double, Double, Double, Double]): DiffFn = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceEuclidean")(mode.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[DiffFn]
  
  inline def differenceHueChroma(colorA: CH, colorB: CH): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceHueChroma")(colorA.asInstanceOf[js.Any], colorB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def differenceHueNaive(colorA: HNumber, colorB: HNumber): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceHueNaive")(colorA.asInstanceOf[js.Any], colorB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def differenceHueSaturation(colorA: S, colorB: S): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("differenceHueSaturation")(colorA.asInstanceOf[js.Any], colorB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def differenceHyab(): DiffFn = ^.asInstanceOf[js.Dynamic].applyDynamic("differenceHyab")().asInstanceOf[DiffFn]
  
  inline def differenceKotsarenkoRamos(): DiffFn = ^.asInstanceOf[js.Dynamic].applyDynamic("differenceKotsarenkoRamos")().asInstanceOf[DiffFn]
  
  type DiffFn = js.Function2[/* colorA */ Color | String, /* colorB */ Color | String, Double]
}
