package typings.cpuFeatures

import typings.cpuFeatures.cpuFeaturesBooleans.`true`
import typings.cpuFeatures.cpuFeaturesStrings.aarch64
import typings.cpuFeatures.cpuFeaturesStrings.arm
import typings.cpuFeatures.cpuFeaturesStrings.mips
import typings.cpuFeatures.cpuFeaturesStrings.ppc
import typings.cpuFeatures.cpuFeaturesStrings.unknown
import typings.cpuFeatures.cpuFeaturesStrings.x86
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A simple node.js binding to [`cpu_features`](https://github.com/google/cpu_features) for obtaining
    * information about installed CPU(s).
    *
    * @example
    * // Generally it's a good idea to just call this once and
    * // reuse the result since `cpu-features` does not cache
    * // the result itself.
    * import cpuFeatures = require('cpu-features');
    *
    * console.log(cpuFeatures());
    * // example output:
    * // {
    * //   arch: 'x86',
    * //   brand: 'Intel(R) Core(TM) i7-3520M CPU @ 2.90GHz',
    * //   family: 6,
    * //   model: 58,
    * //   stepping: 9,
    * //   uarch: 'INTEL_IVB',
    * //   flags: {
    * //     fpu: true,
    * //     tsc: true,
    * //     cx8: true,
    * //     clfsh: true,
    * //     mmx: true,
    * //     aes: true,
    * //     erms: true,
    * //     f16c: true,
    * //     sse: true,
    * //     sse2: true,
    * //     sse3: true,
    * //     ssse3: true,
    * //     sse4_1: true,
    * //     sse4_2: true,
    * //     avx: true,
    * //     pclmulqdq: true,
    * //     smx: true,
    * //     cx16: true,
    * //     popcnt: true,
    * //     rdrnd: true,
    * //     ss: true
    * //   }
    * // }
    */
  inline def apply(): CpuFeatures = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[CpuFeatures]
  
  @JSImport("cpu-features", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Aarch64CpuFeatures
    extends StObject
       with CpuFeatures {
    
    var arch: aarch64
    
    var flags: Aarch64CpuFlags
    
    var implementer: Double
    
    var part: Double
    
    var revision: Double
    
    var variant: Double
  }
  object Aarch64CpuFeatures {
    
    inline def apply(flags: Aarch64CpuFlags, implementer: Double, part: Double, revision: Double, variant: Double): Aarch64CpuFeatures = {
      val __obj = js.Dynamic.literal(arch = "aarch64", flags = flags.asInstanceOf[js.Any], implementer = implementer.asInstanceOf[js.Any], part = part.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
      __obj.asInstanceOf[Aarch64CpuFeatures]
    }
    
    extension [Self <: Aarch64CpuFeatures](x: Self) {
      
      inline def setArch(value: aarch64): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Aarch64CpuFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setImplementer(value: Double): Self = StObject.set(x, "implementer", value.asInstanceOf[js.Any])
      
      inline def setPart(value: Double): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
      
      inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setVariant(value: Double): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    }
  }
  
  trait Aarch64CpuFlags extends StObject {
    
    /**
      * Hardware-accelerated Advanced Encryption Standard.
      */
    var aes: js.UndefOr[`true`] = js.undefined
    
    /**
      * Advanced SIMD.
      */
    var asimd: js.UndefOr[`true`] = js.undefined
    
    /**
      * Dot product instruction.
      */
    var asimddp: js.UndefOr[`true`] = js.undefined
    
    /**
      * Additional half-precision instructions.
      */
    var asimdfhm: js.UndefOr[`true`] = js.undefined
    
    /**
      * Advanced SIMD half-precision support.
      */
    var asimdhp: js.UndefOr[`true`] = js.undefined
    
    /**
      * Rounding Double Multiply Accumulate/Subtract.
      */
    var asimdrdm: js.UndefOr[`true`] = js.undefined
    
    /**
      * Armv8.1 atomic instructions.
      */
    var atomics: js.UndefOr[`true`] = js.undefined
    
    /**
      * BFloat16 instructions.
      */
    var bf16: js.UndefOr[`true`] = js.undefined
    
    /**
      * Branch target identification.
      */
    var bti: js.UndefOr[`true`] = js.undefined
    
    /**
      * Access to certain ID registers.
      */
    var cpuid: js.UndefOr[`true`] = js.undefined
    
    /**
      * Hardware-accelerated CRC-32.
      */
    var crc32: js.UndefOr[`true`] = js.undefined
    
    /**
      * Data cache clean to point of persistence.
      */
    var dcpodp: js.UndefOr[`true`] = js.undefined
    
    /**
      * Data persistence writeback.
      */
    var dcpop: js.UndefOr[`true`] = js.undefined
    
    /**
      * Data Gathering Hint instruction.
      */
    var dgh: js.UndefOr[`true`] = js.undefined
    
    /**
      * Data independent timing.
      */
    var dit: js.UndefOr[`true`] = js.undefined
    
    /**
      * Generic timer generated events.
      */
    var evtstrm: js.UndefOr[`true`] = js.undefined
    
    /**
      * Floating point complex numbers.
      */
    var fcma: js.UndefOr[`true`] = js.undefined
    
    /**
      * Flag manipulation instructions.
      */
    var flagm: js.UndefOr[`true`] = js.undefined
    
    /**
      * Additional flag manipulation instructions.
      */
    var flagm2: js.UndefOr[`true`] = js.undefined
    
    /**
      * Floating-point.
      */
    var fp: js.UndefOr[`true`] = js.undefined
    
    /**
      * Half-precision floating point support.
      */
    var fphp: js.UndefOr[`true`] = js.undefined
    
    /**
      * Floating point to integer rounding.
      */
    var frint: js.UndefOr[`true`] = js.undefined
    
    /**
      * Int8 matrix multiplication instructions.
      */
    var i8mm: js.UndefOr[`true`] = js.undefined
    
    /**
      * Additional support for weaker release consistency.
      */
    var ilrcpc: js.UndefOr[`true`] = js.undefined
    
    /**
      * Support for JavaScript conversion.
      */
    var jscvt: js.UndefOr[`true`] = js.undefined
    
    /**
      * Support for weaker release consistency.
      */
    var lrcpc: js.UndefOr[`true`] = js.undefined
    
    /**
      * Memory tagging extension.
      */
    var mte: js.UndefOr[`true`] = js.undefined
    
    /**
      * Address authentication.
      */
    var paca: js.UndefOr[`true`] = js.undefined
    
    /**
      * Generic authentication.
      */
    var pacg: js.UndefOr[`true`] = js.undefined
    
    /**
      * Polynomial multiply long.
      */
    var pmull: js.UndefOr[`true`] = js.undefined
    
    /**
      * True random number generator support.
      */
    var rng: js.UndefOr[`true`] = js.undefined
    
    /**
      * Speculation barrier.
      */
    var sb: js.UndefOr[`true`] = js.undefined
    
    /**
      * Hardware-accelerated SHA1.
      */
    var sha1: js.UndefOr[`true`] = js.undefined
    
    /**
      * Hardware-accelerated SHA2-256.
      */
    var sha2: js.UndefOr[`true`] = js.undefined
    
    /**
      * Hardware-accelerated SHA3.
      */
    var sha3: js.UndefOr[`true`] = js.undefined
    
    /**
      * Hardware-accelerated SHA512.
      */
    var sha512: js.UndefOr[`true`] = js.undefined
    
    /**
      * Hardware-accelerated SM3.
      */
    var sm3: js.UndefOr[`true`] = js.undefined
    
    /**
      * Hardware-accelerated SM4.
      */
    var sm4: js.UndefOr[`true`] = js.undefined
    
    /**
      * Speculative Store Bypass Safe PSTATE bit.
      */
    var ssbs: js.UndefOr[`true`] = js.undefined
    
    /**
      * Scalable Vector Extension.
      */
    var sve: js.UndefOr[`true`] = js.undefined
    
    /**
      * Scalable Vector Extension (version 2).
      */
    var sve2: js.UndefOr[`true`] = js.undefined
    
    /**
      * SVE AES instructions.
      */
    var sveaes: js.UndefOr[`true`] = js.undefined
    
    /**
      * SVE BFloat16 instructions.
      */
    var svebf16: js.UndefOr[`true`] = js.undefined
    
    /**
      * SVE bit permute instructions.
      */
    var svebitperm: js.UndefOr[`true`] = js.undefined
    
    /**
      * SVE FP32 matrix multiplication instruction.
      */
    var svef32mm: js.UndefOr[`true`] = js.undefined
    
    /**
      * SVE FP64 matrix multiplication instructions.
      */
    var svef64mm: js.UndefOr[`true`] = js.undefined
    
    /**
      * SVE Int8 matrix multiplication instructions.
      */
    var svei8mm: js.UndefOr[`true`] = js.undefined
    
    /**
      * SVE polynomial multiply long instructions.
      */
    var svepmull: js.UndefOr[`true`] = js.undefined
    
    /**
      * SVE SHA3 instructions.
      */
    var svesha3: js.UndefOr[`true`] = js.undefined
    
    /**
      * SVE SM4 instructions.
      */
    var svesm4: js.UndefOr[`true`] = js.undefined
    
    /**
      * Unaligned atomics support.
      */
    var uscat: js.UndefOr[`true`] = js.undefined
  }
  object Aarch64CpuFlags {
    
    inline def apply(): Aarch64CpuFlags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Aarch64CpuFlags]
    }
    
    extension [Self <: Aarch64CpuFlags](x: Self) {
      
      inline def setAes(value: `true`): Self = StObject.set(x, "aes", value.asInstanceOf[js.Any])
      
      inline def setAesUndefined: Self = StObject.set(x, "aes", js.undefined)
      
      inline def setAsimd(value: `true`): Self = StObject.set(x, "asimd", value.asInstanceOf[js.Any])
      
      inline def setAsimdUndefined: Self = StObject.set(x, "asimd", js.undefined)
      
      inline def setAsimddp(value: `true`): Self = StObject.set(x, "asimddp", value.asInstanceOf[js.Any])
      
      inline def setAsimddpUndefined: Self = StObject.set(x, "asimddp", js.undefined)
      
      inline def setAsimdfhm(value: `true`): Self = StObject.set(x, "asimdfhm", value.asInstanceOf[js.Any])
      
      inline def setAsimdfhmUndefined: Self = StObject.set(x, "asimdfhm", js.undefined)
      
      inline def setAsimdhp(value: `true`): Self = StObject.set(x, "asimdhp", value.asInstanceOf[js.Any])
      
      inline def setAsimdhpUndefined: Self = StObject.set(x, "asimdhp", js.undefined)
      
      inline def setAsimdrdm(value: `true`): Self = StObject.set(x, "asimdrdm", value.asInstanceOf[js.Any])
      
      inline def setAsimdrdmUndefined: Self = StObject.set(x, "asimdrdm", js.undefined)
      
      inline def setAtomics(value: `true`): Self = StObject.set(x, "atomics", value.asInstanceOf[js.Any])
      
      inline def setAtomicsUndefined: Self = StObject.set(x, "atomics", js.undefined)
      
      inline def setBf16(value: `true`): Self = StObject.set(x, "bf16", value.asInstanceOf[js.Any])
      
      inline def setBf16Undefined: Self = StObject.set(x, "bf16", js.undefined)
      
      inline def setBti(value: `true`): Self = StObject.set(x, "bti", value.asInstanceOf[js.Any])
      
      inline def setBtiUndefined: Self = StObject.set(x, "bti", js.undefined)
      
      inline def setCpuid(value: `true`): Self = StObject.set(x, "cpuid", value.asInstanceOf[js.Any])
      
      inline def setCpuidUndefined: Self = StObject.set(x, "cpuid", js.undefined)
      
      inline def setCrc32(value: `true`): Self = StObject.set(x, "crc32", value.asInstanceOf[js.Any])
      
      inline def setCrc32Undefined: Self = StObject.set(x, "crc32", js.undefined)
      
      inline def setDcpodp(value: `true`): Self = StObject.set(x, "dcpodp", value.asInstanceOf[js.Any])
      
      inline def setDcpodpUndefined: Self = StObject.set(x, "dcpodp", js.undefined)
      
      inline def setDcpop(value: `true`): Self = StObject.set(x, "dcpop", value.asInstanceOf[js.Any])
      
      inline def setDcpopUndefined: Self = StObject.set(x, "dcpop", js.undefined)
      
      inline def setDgh(value: `true`): Self = StObject.set(x, "dgh", value.asInstanceOf[js.Any])
      
      inline def setDghUndefined: Self = StObject.set(x, "dgh", js.undefined)
      
      inline def setDit(value: `true`): Self = StObject.set(x, "dit", value.asInstanceOf[js.Any])
      
      inline def setDitUndefined: Self = StObject.set(x, "dit", js.undefined)
      
      inline def setEvtstrm(value: `true`): Self = StObject.set(x, "evtstrm", value.asInstanceOf[js.Any])
      
      inline def setEvtstrmUndefined: Self = StObject.set(x, "evtstrm", js.undefined)
      
      inline def setFcma(value: `true`): Self = StObject.set(x, "fcma", value.asInstanceOf[js.Any])
      
      inline def setFcmaUndefined: Self = StObject.set(x, "fcma", js.undefined)
      
      inline def setFlagm(value: `true`): Self = StObject.set(x, "flagm", value.asInstanceOf[js.Any])
      
      inline def setFlagm2(value: `true`): Self = StObject.set(x, "flagm2", value.asInstanceOf[js.Any])
      
      inline def setFlagm2Undefined: Self = StObject.set(x, "flagm2", js.undefined)
      
      inline def setFlagmUndefined: Self = StObject.set(x, "flagm", js.undefined)
      
      inline def setFp(value: `true`): Self = StObject.set(x, "fp", value.asInstanceOf[js.Any])
      
      inline def setFpUndefined: Self = StObject.set(x, "fp", js.undefined)
      
      inline def setFphp(value: `true`): Self = StObject.set(x, "fphp", value.asInstanceOf[js.Any])
      
      inline def setFphpUndefined: Self = StObject.set(x, "fphp", js.undefined)
      
      inline def setFrint(value: `true`): Self = StObject.set(x, "frint", value.asInstanceOf[js.Any])
      
      inline def setFrintUndefined: Self = StObject.set(x, "frint", js.undefined)
      
      inline def setI8mm(value: `true`): Self = StObject.set(x, "i8mm", value.asInstanceOf[js.Any])
      
      inline def setI8mmUndefined: Self = StObject.set(x, "i8mm", js.undefined)
      
      inline def setIlrcpc(value: `true`): Self = StObject.set(x, "ilrcpc", value.asInstanceOf[js.Any])
      
      inline def setIlrcpcUndefined: Self = StObject.set(x, "ilrcpc", js.undefined)
      
      inline def setJscvt(value: `true`): Self = StObject.set(x, "jscvt", value.asInstanceOf[js.Any])
      
      inline def setJscvtUndefined: Self = StObject.set(x, "jscvt", js.undefined)
      
      inline def setLrcpc(value: `true`): Self = StObject.set(x, "lrcpc", value.asInstanceOf[js.Any])
      
      inline def setLrcpcUndefined: Self = StObject.set(x, "lrcpc", js.undefined)
      
      inline def setMte(value: `true`): Self = StObject.set(x, "mte", value.asInstanceOf[js.Any])
      
      inline def setMteUndefined: Self = StObject.set(x, "mte", js.undefined)
      
      inline def setPaca(value: `true`): Self = StObject.set(x, "paca", value.asInstanceOf[js.Any])
      
      inline def setPacaUndefined: Self = StObject.set(x, "paca", js.undefined)
      
      inline def setPacg(value: `true`): Self = StObject.set(x, "pacg", value.asInstanceOf[js.Any])
      
      inline def setPacgUndefined: Self = StObject.set(x, "pacg", js.undefined)
      
      inline def setPmull(value: `true`): Self = StObject.set(x, "pmull", value.asInstanceOf[js.Any])
      
      inline def setPmullUndefined: Self = StObject.set(x, "pmull", js.undefined)
      
      inline def setRng(value: `true`): Self = StObject.set(x, "rng", value.asInstanceOf[js.Any])
      
      inline def setRngUndefined: Self = StObject.set(x, "rng", js.undefined)
      
      inline def setSb(value: `true`): Self = StObject.set(x, "sb", value.asInstanceOf[js.Any])
      
      inline def setSbUndefined: Self = StObject.set(x, "sb", js.undefined)
      
      inline def setSha1(value: `true`): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
      
      inline def setSha1Undefined: Self = StObject.set(x, "sha1", js.undefined)
      
      inline def setSha2(value: `true`): Self = StObject.set(x, "sha2", value.asInstanceOf[js.Any])
      
      inline def setSha2Undefined: Self = StObject.set(x, "sha2", js.undefined)
      
      inline def setSha3(value: `true`): Self = StObject.set(x, "sha3", value.asInstanceOf[js.Any])
      
      inline def setSha3Undefined: Self = StObject.set(x, "sha3", js.undefined)
      
      inline def setSha512(value: `true`): Self = StObject.set(x, "sha512", value.asInstanceOf[js.Any])
      
      inline def setSha512Undefined: Self = StObject.set(x, "sha512", js.undefined)
      
      inline def setSm3(value: `true`): Self = StObject.set(x, "sm3", value.asInstanceOf[js.Any])
      
      inline def setSm3Undefined: Self = StObject.set(x, "sm3", js.undefined)
      
      inline def setSm4(value: `true`): Self = StObject.set(x, "sm4", value.asInstanceOf[js.Any])
      
      inline def setSm4Undefined: Self = StObject.set(x, "sm4", js.undefined)
      
      inline def setSsbs(value: `true`): Self = StObject.set(x, "ssbs", value.asInstanceOf[js.Any])
      
      inline def setSsbsUndefined: Self = StObject.set(x, "ssbs", js.undefined)
      
      inline def setSve(value: `true`): Self = StObject.set(x, "sve", value.asInstanceOf[js.Any])
      
      inline def setSve2(value: `true`): Self = StObject.set(x, "sve2", value.asInstanceOf[js.Any])
      
      inline def setSve2Undefined: Self = StObject.set(x, "sve2", js.undefined)
      
      inline def setSveUndefined: Self = StObject.set(x, "sve", js.undefined)
      
      inline def setSveaes(value: `true`): Self = StObject.set(x, "sveaes", value.asInstanceOf[js.Any])
      
      inline def setSveaesUndefined: Self = StObject.set(x, "sveaes", js.undefined)
      
      inline def setSvebf16(value: `true`): Self = StObject.set(x, "svebf16", value.asInstanceOf[js.Any])
      
      inline def setSvebf16Undefined: Self = StObject.set(x, "svebf16", js.undefined)
      
      inline def setSvebitperm(value: `true`): Self = StObject.set(x, "svebitperm", value.asInstanceOf[js.Any])
      
      inline def setSvebitpermUndefined: Self = StObject.set(x, "svebitperm", js.undefined)
      
      inline def setSvef32mm(value: `true`): Self = StObject.set(x, "svef32mm", value.asInstanceOf[js.Any])
      
      inline def setSvef32mmUndefined: Self = StObject.set(x, "svef32mm", js.undefined)
      
      inline def setSvef64mm(value: `true`): Self = StObject.set(x, "svef64mm", value.asInstanceOf[js.Any])
      
      inline def setSvef64mmUndefined: Self = StObject.set(x, "svef64mm", js.undefined)
      
      inline def setSvei8mm(value: `true`): Self = StObject.set(x, "svei8mm", value.asInstanceOf[js.Any])
      
      inline def setSvei8mmUndefined: Self = StObject.set(x, "svei8mm", js.undefined)
      
      inline def setSvepmull(value: `true`): Self = StObject.set(x, "svepmull", value.asInstanceOf[js.Any])
      
      inline def setSvepmullUndefined: Self = StObject.set(x, "svepmull", js.undefined)
      
      inline def setSvesha3(value: `true`): Self = StObject.set(x, "svesha3", value.asInstanceOf[js.Any])
      
      inline def setSvesha3Undefined: Self = StObject.set(x, "svesha3", js.undefined)
      
      inline def setSvesm4(value: `true`): Self = StObject.set(x, "svesm4", value.asInstanceOf[js.Any])
      
      inline def setSvesm4Undefined: Self = StObject.set(x, "svesm4", js.undefined)
      
      inline def setUscat(value: `true`): Self = StObject.set(x, "uscat", value.asInstanceOf[js.Any])
      
      inline def setUscatUndefined: Self = StObject.set(x, "uscat", js.undefined)
    }
  }
  
  trait ArmCpuFeatures
    extends StObject
       with CpuFeatures {
    
    var arch: arm
    
    var architecture: Double
    
    var flags: ArmCpuFlags
    
    var implementer: Double
    
    var part: Double
    
    var revision: Double
    
    var variant: Double
  }
  object ArmCpuFeatures {
    
    inline def apply(
      architecture: Double,
      flags: ArmCpuFlags,
      implementer: Double,
      part: Double,
      revision: Double,
      variant: Double
    ): ArmCpuFeatures = {
      val __obj = js.Dynamic.literal(arch = "arm", architecture = architecture.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], implementer = implementer.asInstanceOf[js.Any], part = part.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArmCpuFeatures]
    }
    
    extension [Self <: ArmCpuFeatures](x: Self) {
      
      inline def setArch(value: arm): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setArchitecture(value: Double): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: ArmCpuFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setImplementer(value: Double): Self = StObject.set(x, "implementer", value.asInstanceOf[js.Any])
      
      inline def setPart(value: Double): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
      
      inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setVariant(value: Double): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArmCpuFlags extends StObject {
    
    /**
      * "26 Bit" Model (Processor status register folded into program counter)
      */
    var _26bit: js.UndefOr[`true`] = js.undefined
    
    /**
      * Hardware-accelerated Advanced Encryption Standard.
      */
    var aes: js.UndefOr[`true`] = js.undefined
    
    /**
      * Hardware-accelerated CRC-32.
      */
    var crc32: js.UndefOr[`true`] = js.undefined
    
    /**
      * MaverickCrunch coprocessor
      */
    var crunch: js.UndefOr[`true`] = js.undefined
    
    /**
      * DSP extensions (the 'e' variant of the ARM9 CPUs, and all others above)
      */
    var edsp: js.UndefOr[`true`] = js.undefined
    
    /**
      * kernel event stream using generic architected timer
      */
    var evtstrm: js.UndefOr[`true`] = js.undefined
    
    /**
      * 32x32->64-bit multiplication
      */
    var fastmult: js.UndefOr[`true`] = js.undefined
    
    /**
      * Floating point accelerator
      */
    var fpa: js.UndefOr[`true`] = js.undefined
    
    /**
      * Half-word loads and stores
      */
    var half: js.UndefOr[`true`] = js.undefined
    
    /**
      * SDIV and UDIV hardware division in ARM mode.
      */
    var idiva: js.UndefOr[`true`] = js.undefined
    
    /**
      * SDIV and UDIV hardware division in Thumb mode.
      */
    var idivt: js.UndefOr[`true`] = js.undefined
    
    /**
      * Intel Wireless MMX Technology.
      */
    var iwmmxt: js.UndefOr[`true`] = js.undefined
    
    /**
      * Jazelle (Java bytecode accelerator)
      */
    @JSName("java")
    var java_ : js.UndefOr[`true`] = js.undefined
    
    /**
      * Large Physical Address Extension (>4GB physical memory on 32-bit architecture)
      */
    var lpae: js.UndefOr[`true`] = js.undefined
    
    /**
      * Advanced SIMD.
      */
    var neon: js.UndefOr[`true`] = js.undefined
    
    /**
      * Polynomial multiply long.
      */
    var pmull: js.UndefOr[`true`] = js.undefined
    
    /**
      * Hardware-accelerated SHA1.
      */
    var sha1: js.UndefOr[`true`] = js.undefined
    
    /**
      * Hardware-accelerated SHA2-256.
      */
    var sha2: js.UndefOr[`true`] = js.undefined
    
    /**
      * SWP instruction (atomic read-modify-write)
      */
    var swp: js.UndefOr[`true`] = js.undefined
    
    /**
      * Thumb (16-bit instruction set)
      */
    var thumb: js.UndefOr[`true`] = js.undefined
    
    /**
      * ThumbEE
      */
    var thumbee: js.UndefOr[`true`] = js.undefined
    
    /**
      * TLS register
      */
    var tls: js.UndefOr[`true`] = js.undefined
    
    /**
      * Vector Floating Point.
      */
    var vfp: js.UndefOr[`true`] = js.undefined
    
    /**
      * VFP with 32 D-registers
      */
    var vfpd32: js.UndefOr[`true`] = js.undefined
    
    /**
      * VFP version 3
      */
    var vfpv3: js.UndefOr[`true`] = js.undefined
    
    /**
      * VFP version 3 with 16 D-registers
      */
    var vfpv3d16: js.UndefOr[`true`] = js.undefined
    
    /**
      * VFP version 4 with fast context switching
      */
    var vfpv4: js.UndefOr[`true`] = js.undefined
  }
  object ArmCpuFlags {
    
    inline def apply(): ArmCpuFlags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArmCpuFlags]
    }
    
    extension [Self <: ArmCpuFlags](x: Self) {
      
      inline def setAes(value: `true`): Self = StObject.set(x, "aes", value.asInstanceOf[js.Any])
      
      inline def setAesUndefined: Self = StObject.set(x, "aes", js.undefined)
      
      inline def setCrc32(value: `true`): Self = StObject.set(x, "crc32", value.asInstanceOf[js.Any])
      
      inline def setCrc32Undefined: Self = StObject.set(x, "crc32", js.undefined)
      
      inline def setCrunch(value: `true`): Self = StObject.set(x, "crunch", value.asInstanceOf[js.Any])
      
      inline def setCrunchUndefined: Self = StObject.set(x, "crunch", js.undefined)
      
      inline def setEdsp(value: `true`): Self = StObject.set(x, "edsp", value.asInstanceOf[js.Any])
      
      inline def setEdspUndefined: Self = StObject.set(x, "edsp", js.undefined)
      
      inline def setEvtstrm(value: `true`): Self = StObject.set(x, "evtstrm", value.asInstanceOf[js.Any])
      
      inline def setEvtstrmUndefined: Self = StObject.set(x, "evtstrm", js.undefined)
      
      inline def setFastmult(value: `true`): Self = StObject.set(x, "fastmult", value.asInstanceOf[js.Any])
      
      inline def setFastmultUndefined: Self = StObject.set(x, "fastmult", js.undefined)
      
      inline def setFpa(value: `true`): Self = StObject.set(x, "fpa", value.asInstanceOf[js.Any])
      
      inline def setFpaUndefined: Self = StObject.set(x, "fpa", js.undefined)
      
      inline def setHalf(value: `true`): Self = StObject.set(x, "half", value.asInstanceOf[js.Any])
      
      inline def setHalfUndefined: Self = StObject.set(x, "half", js.undefined)
      
      inline def setIdiva(value: `true`): Self = StObject.set(x, "idiva", value.asInstanceOf[js.Any])
      
      inline def setIdivaUndefined: Self = StObject.set(x, "idiva", js.undefined)
      
      inline def setIdivt(value: `true`): Self = StObject.set(x, "idivt", value.asInstanceOf[js.Any])
      
      inline def setIdivtUndefined: Self = StObject.set(x, "idivt", js.undefined)
      
      inline def setIwmmxt(value: `true`): Self = StObject.set(x, "iwmmxt", value.asInstanceOf[js.Any])
      
      inline def setIwmmxtUndefined: Self = StObject.set(x, "iwmmxt", js.undefined)
      
      inline def setJava_(value: `true`): Self = StObject.set(x, "java", value.asInstanceOf[js.Any])
      
      inline def setJava_Undefined: Self = StObject.set(x, "java", js.undefined)
      
      inline def setLpae(value: `true`): Self = StObject.set(x, "lpae", value.asInstanceOf[js.Any])
      
      inline def setLpaeUndefined: Self = StObject.set(x, "lpae", js.undefined)
      
      inline def setNeon(value: `true`): Self = StObject.set(x, "neon", value.asInstanceOf[js.Any])
      
      inline def setNeonUndefined: Self = StObject.set(x, "neon", js.undefined)
      
      inline def setPmull(value: `true`): Self = StObject.set(x, "pmull", value.asInstanceOf[js.Any])
      
      inline def setPmullUndefined: Self = StObject.set(x, "pmull", js.undefined)
      
      inline def setSha1(value: `true`): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
      
      inline def setSha1Undefined: Self = StObject.set(x, "sha1", js.undefined)
      
      inline def setSha2(value: `true`): Self = StObject.set(x, "sha2", value.asInstanceOf[js.Any])
      
      inline def setSha2Undefined: Self = StObject.set(x, "sha2", js.undefined)
      
      inline def setSwp(value: `true`): Self = StObject.set(x, "swp", value.asInstanceOf[js.Any])
      
      inline def setSwpUndefined: Self = StObject.set(x, "swp", js.undefined)
      
      inline def setThumb(value: `true`): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
      
      inline def setThumbee(value: `true`): Self = StObject.set(x, "thumbee", value.asInstanceOf[js.Any])
      
      inline def setThumbeeUndefined: Self = StObject.set(x, "thumbee", js.undefined)
      
      inline def setTls(value: `true`): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setVfp(value: `true`): Self = StObject.set(x, "vfp", value.asInstanceOf[js.Any])
      
      inline def setVfpUndefined: Self = StObject.set(x, "vfp", js.undefined)
      
      inline def setVfpd32(value: `true`): Self = StObject.set(x, "vfpd32", value.asInstanceOf[js.Any])
      
      inline def setVfpd32Undefined: Self = StObject.set(x, "vfpd32", js.undefined)
      
      inline def setVfpv3(value: `true`): Self = StObject.set(x, "vfpv3", value.asInstanceOf[js.Any])
      
      inline def setVfpv3Undefined: Self = StObject.set(x, "vfpv3", js.undefined)
      
      inline def setVfpv3d16(value: `true`): Self = StObject.set(x, "vfpv3d16", value.asInstanceOf[js.Any])
      
      inline def setVfpv3d16Undefined: Self = StObject.set(x, "vfpv3d16", js.undefined)
      
      inline def setVfpv4(value: `true`): Self = StObject.set(x, "vfpv4", value.asInstanceOf[js.Any])
      
      inline def setVfpv4Undefined: Self = StObject.set(x, "vfpv4", js.undefined)
      
      inline def set_26bit(value: `true`): Self = StObject.set(x, "_26bit", value.asInstanceOf[js.Any])
      
      inline def set_26bitUndefined: Self = StObject.set(x, "_26bit", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cpuFeatures.mod.X86CpuFeatures
    - typings.cpuFeatures.mod.ArmCpuFeatures
    - typings.cpuFeatures.mod.Aarch64CpuFeatures
    - typings.cpuFeatures.mod.MipsCpuFeatures
    - typings.cpuFeatures.mod.PPCCpuFeatures
    - typings.cpuFeatures.mod.UnknownCpuFeatures
  */
  trait CpuFeatures extends StObject
  object CpuFeatures {
    
    inline def Aarch64CpuFeatures(flags: Aarch64CpuFlags, implementer: Double, part: Double, revision: Double, variant: Double): typings.cpuFeatures.mod.Aarch64CpuFeatures = {
      val __obj = js.Dynamic.literal(arch = "aarch64", flags = flags.asInstanceOf[js.Any], implementer = implementer.asInstanceOf[js.Any], part = part.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cpuFeatures.mod.Aarch64CpuFeatures]
    }
    
    inline def ArmCpuFeatures(
      architecture: Double,
      flags: ArmCpuFlags,
      implementer: Double,
      part: Double,
      revision: Double,
      variant: Double
    ): typings.cpuFeatures.mod.ArmCpuFeatures = {
      val __obj = js.Dynamic.literal(arch = "arm", architecture = architecture.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], implementer = implementer.asInstanceOf[js.Any], part = part.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cpuFeatures.mod.ArmCpuFeatures]
    }
    
    inline def MipsCpuFeatures(flags: MipsCpuFlags): typings.cpuFeatures.mod.MipsCpuFeatures = {
      val __obj = js.Dynamic.literal(arch = "mips", flags = flags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cpuFeatures.mod.MipsCpuFeatures]
    }
    
    inline def PPCCpuFeatures(
      cpu: String,
      flags: PPCCpuFlags,
      `instruction set`: String,
      machine: String,
      microarchitecture: String,
      model: String,
      platform: String
    ): typings.cpuFeatures.mod.PPCCpuFeatures = {
      val __obj = js.Dynamic.literal(arch = "ppc", cpu = cpu.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], machine = machine.asInstanceOf[js.Any], microarchitecture = microarchitecture.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.updateDynamic("instruction set")((`instruction set`).asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cpuFeatures.mod.PPCCpuFeatures]
    }
    
    inline def UnknownCpuFeatures(): typings.cpuFeatures.mod.UnknownCpuFeatures = {
      val __obj = js.Dynamic.literal(arch = "unknown")
      __obj.asInstanceOf[typings.cpuFeatures.mod.UnknownCpuFeatures]
    }
    
    inline def X86CpuFeatures(
      brand: String,
      family: Double,
      flags: X86CpuFlags,
      model: Double,
      stepping: Double,
      uarch: X86UArch
    ): typings.cpuFeatures.mod.X86CpuFeatures = {
      val __obj = js.Dynamic.literal(arch = "x86", brand = brand.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], stepping = stepping.asInstanceOf[js.Any], uarch = uarch.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cpuFeatures.mod.X86CpuFeatures]
    }
  }
  
  trait MipsCpuFeatures
    extends StObject
       with CpuFeatures {
    
    var arch: mips
    
    var flags: MipsCpuFlags
  }
  object MipsCpuFeatures {
    
    inline def apply(flags: MipsCpuFlags): MipsCpuFeatures = {
      val __obj = js.Dynamic.literal(arch = "mips", flags = flags.asInstanceOf[js.Any])
      __obj.asInstanceOf[MipsCpuFeatures]
    }
    
    extension [Self <: MipsCpuFeatures](x: Self) {
      
      inline def setArch(value: mips): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: MipsCpuFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    }
  }
  
  trait MipsCpuFlags extends StObject {
    
    /**
      * Enhanced Virtual Addressing
      * https://www.mips.com/products/architectures/mips64/
      */
    var eva: js.UndefOr[`true`] = js.undefined
    
    /*
      * MIPS SIMD Architecture
      * https://www.mips.com/products/architectures/ase/simd/
      */
    var msa: js.UndefOr[`true`] = js.undefined
    
    /**
      * `true` if is release 6 of the processor.
      */
    var r6: js.UndefOr[`true`] = js.undefined
  }
  object MipsCpuFlags {
    
    inline def apply(): MipsCpuFlags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MipsCpuFlags]
    }
    
    extension [Self <: MipsCpuFlags](x: Self) {
      
      inline def setEva(value: `true`): Self = StObject.set(x, "eva", value.asInstanceOf[js.Any])
      
      inline def setEvaUndefined: Self = StObject.set(x, "eva", js.undefined)
      
      inline def setMsa(value: `true`): Self = StObject.set(x, "msa", value.asInstanceOf[js.Any])
      
      inline def setMsaUndefined: Self = StObject.set(x, "msa", js.undefined)
      
      inline def setR6(value: `true`): Self = StObject.set(x, "r6", value.asInstanceOf[js.Any])
      
      inline def setR6Undefined: Self = StObject.set(x, "r6", js.undefined)
    }
  }
  
  trait PPCCpuFeatures
    extends StObject
       with CpuFeatures {
    
    var arch: ppc
    
    var cpu: String
    
    var flags: PPCCpuFlags
    
    var `instruction set`: String
    
    var machine: String
    
    var microarchitecture: String
    
    var model: String
    
    var platform: String
  }
  object PPCCpuFeatures {
    
    inline def apply(
      cpu: String,
      flags: PPCCpuFlags,
      `instruction set`: String,
      machine: String,
      microarchitecture: String,
      model: String,
      platform: String
    ): PPCCpuFeatures = {
      val __obj = js.Dynamic.literal(arch = "ppc", cpu = cpu.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], machine = machine.asInstanceOf[js.Any], microarchitecture = microarchitecture.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.updateDynamic("instruction set")((`instruction set`).asInstanceOf[js.Any])
      __obj.asInstanceOf[PPCCpuFeatures]
    }
    
    extension [Self <: PPCCpuFeatures](x: Self) {
      
      inline def setArch(value: ppc): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setCpu(value: String): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: PPCCpuFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def `setInstruction set`(value: String): Self = StObject.set(x, "instruction set", value.asInstanceOf[js.Any])
      
      inline def setMachine(value: String): Self = StObject.set(x, "machine", value.asInstanceOf[js.Any])
      
      inline def setMicroarchitecture(value: String): Self = StObject.set(x, "microarchitecture", value.asInstanceOf[js.Any])
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  trait PPCCpuFlags extends StObject {
    
    var altivec: js.UndefOr[`true`] = js.undefined
    
    var arch205: js.UndefOr[`true`] = js.undefined
    
    var arch206: js.UndefOr[`true`] = js.undefined
    
    var arch207: js.UndefOr[`true`] = js.undefined
    
    var arch300: js.UndefOr[`true`] = js.undefined
    
    var booke: js.UndefOr[`true`] = js.undefined
    
    var cell: js.UndefOr[`true`] = js.undefined
    
    var darn: js.UndefOr[`true`] = js.undefined
    
    var dfp: js.UndefOr[`true`] = js.undefined
    
    var dscr: js.UndefOr[`true`] = js.undefined
    
    var ebb: js.UndefOr[`true`] = js.undefined
    
    var efpdouble: js.UndefOr[`true`] = js.undefined
    
    var efpsingle: js.UndefOr[`true`] = js.undefined
    
    var fpu: js.UndefOr[`true`] = js.undefined
    
    var htm: js.UndefOr[`true`] = js.undefined
    
    var htm_no_suspend: js.UndefOr[`true`] = js.undefined
    
    var htm_nosc: js.UndefOr[`true`] = js.undefined
    
    var icachesnoop: js.UndefOr[`true`] = js.undefined
    
    var ieee128: js.UndefOr[`true`] = js.undefined
    
    var isel: js.UndefOr[`true`] = js.undefined
    
    var mac_4xx: js.UndefOr[`true`] = js.undefined
    
    var mmu: js.UndefOr[`true`] = js.undefined
    
    var no_tb: js.UndefOr[`true`] = js.undefined
    
    var pa6t: js.UndefOr[`true`] = js.undefined
    
    var power4: js.UndefOr[`true`] = js.undefined
    
    var power5: js.UndefOr[`true`] = js.undefined
    
    var power5plus: js.UndefOr[`true`] = js.undefined
    
    var power6ext: js.UndefOr[`true`] = js.undefined
    
    var ppc32: js.UndefOr[`true`] = js.undefined
    
    var ppc601: js.UndefOr[`true`] = js.undefined
    
    var ppc64: js.UndefOr[`true`] = js.undefined
    
    var ppcle: js.UndefOr[`true`] = js.undefined
    
    var pseries_perfmon_compat: js.UndefOr[`true`] = js.undefined
    
    var scv: js.UndefOr[`true`] = js.undefined
    
    var smt: js.UndefOr[`true`] = js.undefined
    
    var spe: js.UndefOr[`true`] = js.undefined
    
    var tar: js.UndefOr[`true`] = js.undefined
    
    var truele: js.UndefOr[`true`] = js.undefined
    
    var unifiedcache: js.UndefOr[`true`] = js.undefined
    
    var vcrypto: js.UndefOr[`true`] = js.undefined
    
    var vsx: js.UndefOr[`true`] = js.undefined
  }
  object PPCCpuFlags {
    
    inline def apply(): PPCCpuFlags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PPCCpuFlags]
    }
    
    extension [Self <: PPCCpuFlags](x: Self) {
      
      inline def setAltivec(value: `true`): Self = StObject.set(x, "altivec", value.asInstanceOf[js.Any])
      
      inline def setAltivecUndefined: Self = StObject.set(x, "altivec", js.undefined)
      
      inline def setArch205(value: `true`): Self = StObject.set(x, "arch205", value.asInstanceOf[js.Any])
      
      inline def setArch205Undefined: Self = StObject.set(x, "arch205", js.undefined)
      
      inline def setArch206(value: `true`): Self = StObject.set(x, "arch206", value.asInstanceOf[js.Any])
      
      inline def setArch206Undefined: Self = StObject.set(x, "arch206", js.undefined)
      
      inline def setArch207(value: `true`): Self = StObject.set(x, "arch207", value.asInstanceOf[js.Any])
      
      inline def setArch207Undefined: Self = StObject.set(x, "arch207", js.undefined)
      
      inline def setArch300(value: `true`): Self = StObject.set(x, "arch300", value.asInstanceOf[js.Any])
      
      inline def setArch300Undefined: Self = StObject.set(x, "arch300", js.undefined)
      
      inline def setBooke(value: `true`): Self = StObject.set(x, "booke", value.asInstanceOf[js.Any])
      
      inline def setBookeUndefined: Self = StObject.set(x, "booke", js.undefined)
      
      inline def setCell(value: `true`): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setDarn(value: `true`): Self = StObject.set(x, "darn", value.asInstanceOf[js.Any])
      
      inline def setDarnUndefined: Self = StObject.set(x, "darn", js.undefined)
      
      inline def setDfp(value: `true`): Self = StObject.set(x, "dfp", value.asInstanceOf[js.Any])
      
      inline def setDfpUndefined: Self = StObject.set(x, "dfp", js.undefined)
      
      inline def setDscr(value: `true`): Self = StObject.set(x, "dscr", value.asInstanceOf[js.Any])
      
      inline def setDscrUndefined: Self = StObject.set(x, "dscr", js.undefined)
      
      inline def setEbb(value: `true`): Self = StObject.set(x, "ebb", value.asInstanceOf[js.Any])
      
      inline def setEbbUndefined: Self = StObject.set(x, "ebb", js.undefined)
      
      inline def setEfpdouble(value: `true`): Self = StObject.set(x, "efpdouble", value.asInstanceOf[js.Any])
      
      inline def setEfpdoubleUndefined: Self = StObject.set(x, "efpdouble", js.undefined)
      
      inline def setEfpsingle(value: `true`): Self = StObject.set(x, "efpsingle", value.asInstanceOf[js.Any])
      
      inline def setEfpsingleUndefined: Self = StObject.set(x, "efpsingle", js.undefined)
      
      inline def setFpu(value: `true`): Self = StObject.set(x, "fpu", value.asInstanceOf[js.Any])
      
      inline def setFpuUndefined: Self = StObject.set(x, "fpu", js.undefined)
      
      inline def setHtm(value: `true`): Self = StObject.set(x, "htm", value.asInstanceOf[js.Any])
      
      inline def setHtmUndefined: Self = StObject.set(x, "htm", js.undefined)
      
      inline def setHtm_no_suspend(value: `true`): Self = StObject.set(x, "htm_no_suspend", value.asInstanceOf[js.Any])
      
      inline def setHtm_no_suspendUndefined: Self = StObject.set(x, "htm_no_suspend", js.undefined)
      
      inline def setHtm_nosc(value: `true`): Self = StObject.set(x, "htm_nosc", value.asInstanceOf[js.Any])
      
      inline def setHtm_noscUndefined: Self = StObject.set(x, "htm_nosc", js.undefined)
      
      inline def setIcachesnoop(value: `true`): Self = StObject.set(x, "icachesnoop", value.asInstanceOf[js.Any])
      
      inline def setIcachesnoopUndefined: Self = StObject.set(x, "icachesnoop", js.undefined)
      
      inline def setIeee128(value: `true`): Self = StObject.set(x, "ieee128", value.asInstanceOf[js.Any])
      
      inline def setIeee128Undefined: Self = StObject.set(x, "ieee128", js.undefined)
      
      inline def setIsel(value: `true`): Self = StObject.set(x, "isel", value.asInstanceOf[js.Any])
      
      inline def setIselUndefined: Self = StObject.set(x, "isel", js.undefined)
      
      inline def setMac_4xx(value: `true`): Self = StObject.set(x, "mac_4xx", value.asInstanceOf[js.Any])
      
      inline def setMac_4xxUndefined: Self = StObject.set(x, "mac_4xx", js.undefined)
      
      inline def setMmu(value: `true`): Self = StObject.set(x, "mmu", value.asInstanceOf[js.Any])
      
      inline def setMmuUndefined: Self = StObject.set(x, "mmu", js.undefined)
      
      inline def setNo_tb(value: `true`): Self = StObject.set(x, "no_tb", value.asInstanceOf[js.Any])
      
      inline def setNo_tbUndefined: Self = StObject.set(x, "no_tb", js.undefined)
      
      inline def setPa6t(value: `true`): Self = StObject.set(x, "pa6t", value.asInstanceOf[js.Any])
      
      inline def setPa6tUndefined: Self = StObject.set(x, "pa6t", js.undefined)
      
      inline def setPower4(value: `true`): Self = StObject.set(x, "power4", value.asInstanceOf[js.Any])
      
      inline def setPower4Undefined: Self = StObject.set(x, "power4", js.undefined)
      
      inline def setPower5(value: `true`): Self = StObject.set(x, "power5", value.asInstanceOf[js.Any])
      
      inline def setPower5Undefined: Self = StObject.set(x, "power5", js.undefined)
      
      inline def setPower5plus(value: `true`): Self = StObject.set(x, "power5plus", value.asInstanceOf[js.Any])
      
      inline def setPower5plusUndefined: Self = StObject.set(x, "power5plus", js.undefined)
      
      inline def setPower6ext(value: `true`): Self = StObject.set(x, "power6ext", value.asInstanceOf[js.Any])
      
      inline def setPower6extUndefined: Self = StObject.set(x, "power6ext", js.undefined)
      
      inline def setPpc32(value: `true`): Self = StObject.set(x, "ppc32", value.asInstanceOf[js.Any])
      
      inline def setPpc32Undefined: Self = StObject.set(x, "ppc32", js.undefined)
      
      inline def setPpc601(value: `true`): Self = StObject.set(x, "ppc601", value.asInstanceOf[js.Any])
      
      inline def setPpc601Undefined: Self = StObject.set(x, "ppc601", js.undefined)
      
      inline def setPpc64(value: `true`): Self = StObject.set(x, "ppc64", value.asInstanceOf[js.Any])
      
      inline def setPpc64Undefined: Self = StObject.set(x, "ppc64", js.undefined)
      
      inline def setPpcle(value: `true`): Self = StObject.set(x, "ppcle", value.asInstanceOf[js.Any])
      
      inline def setPpcleUndefined: Self = StObject.set(x, "ppcle", js.undefined)
      
      inline def setPseries_perfmon_compat(value: `true`): Self = StObject.set(x, "pseries_perfmon_compat", value.asInstanceOf[js.Any])
      
      inline def setPseries_perfmon_compatUndefined: Self = StObject.set(x, "pseries_perfmon_compat", js.undefined)
      
      inline def setScv(value: `true`): Self = StObject.set(x, "scv", value.asInstanceOf[js.Any])
      
      inline def setScvUndefined: Self = StObject.set(x, "scv", js.undefined)
      
      inline def setSmt(value: `true`): Self = StObject.set(x, "smt", value.asInstanceOf[js.Any])
      
      inline def setSmtUndefined: Self = StObject.set(x, "smt", js.undefined)
      
      inline def setSpe(value: `true`): Self = StObject.set(x, "spe", value.asInstanceOf[js.Any])
      
      inline def setSpeUndefined: Self = StObject.set(x, "spe", js.undefined)
      
      inline def setTar(value: `true`): Self = StObject.set(x, "tar", value.asInstanceOf[js.Any])
      
      inline def setTarUndefined: Self = StObject.set(x, "tar", js.undefined)
      
      inline def setTruele(value: `true`): Self = StObject.set(x, "truele", value.asInstanceOf[js.Any])
      
      inline def setTrueleUndefined: Self = StObject.set(x, "truele", js.undefined)
      
      inline def setUnifiedcache(value: `true`): Self = StObject.set(x, "unifiedcache", value.asInstanceOf[js.Any])
      
      inline def setUnifiedcacheUndefined: Self = StObject.set(x, "unifiedcache", js.undefined)
      
      inline def setVcrypto(value: `true`): Self = StObject.set(x, "vcrypto", value.asInstanceOf[js.Any])
      
      inline def setVcryptoUndefined: Self = StObject.set(x, "vcrypto", js.undefined)
      
      inline def setVsx(value: `true`): Self = StObject.set(x, "vsx", value.asInstanceOf[js.Any])
      
      inline def setVsxUndefined: Self = StObject.set(x, "vsx", js.undefined)
    }
  }
  
  trait UnknownCpuFeatures
    extends StObject
       with CpuFeatures {
    
    var arch: unknown
  }
  object UnknownCpuFeatures {
    
    inline def apply(): UnknownCpuFeatures = {
      val __obj = js.Dynamic.literal(arch = "unknown")
      __obj.asInstanceOf[UnknownCpuFeatures]
    }
    
    extension [Self <: UnknownCpuFeatures](x: Self) {
      
      inline def setArch(value: unknown): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
    }
  }
  
  trait X86CpuFeatures
    extends StObject
       with CpuFeatures {
    
    var arch: x86
    
    var brand: String
    
    var family: Double
    
    var flags: X86CpuFlags
    
    var model: Double
    
    var stepping: Double
    
    var uarch: X86UArch
  }
  object X86CpuFeatures {
    
    inline def apply(
      brand: String,
      family: Double,
      flags: X86CpuFlags,
      model: Double,
      stepping: Double,
      uarch: X86UArch
    ): X86CpuFeatures = {
      val __obj = js.Dynamic.literal(arch = "x86", brand = brand.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], stepping = stepping.asInstanceOf[js.Any], uarch = uarch.asInstanceOf[js.Any])
      __obj.asInstanceOf[X86CpuFeatures]
    }
    
    extension [Self <: X86CpuFeatures](x: Self) {
      
      inline def setArch(value: x86): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: X86CpuFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setModel(value: Double): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setStepping(value: Double): Self = StObject.set(x, "stepping", value.asInstanceOf[js.Any])
      
      inline def setUarch(value: X86UArch): Self = StObject.set(x, "uarch", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * See https://en.wikipedia.org/wiki/CPUID for a list of x86 cpu features.
    * The field names are based on the short name provided in the wikipedia tables.
    */
  trait X86CpuFlags extends StObject {
    
    var aes: js.UndefOr[`true`] = js.undefined
    
    var amx_bf16: js.UndefOr[`true`] = js.undefined
    
    var amx_int8: js.UndefOr[`true`] = js.undefined
    
    var amx_tile: js.UndefOr[`true`] = js.undefined
    
    var avx: js.UndefOr[`true`] = js.undefined
    
    var avx2: js.UndefOr[`true`] = js.undefined
    
    var avx512_4fmaps: js.UndefOr[`true`] = js.undefined
    
    var avx512_4vbmi2: js.UndefOr[`true`] = js.undefined
    
    var avx512_4vnniw: js.UndefOr[`true`] = js.undefined
    
    var avx512_bf16: js.UndefOr[`true`] = js.undefined
    
    var avx512_second_fma: js.UndefOr[`true`] = js.undefined
    
    var avx512_vp2intersect: js.UndefOr[`true`] = js.undefined
    
    var avx512bitalg: js.UndefOr[`true`] = js.undefined
    
    var avx512bw: js.UndefOr[`true`] = js.undefined
    
    var avx512cd: js.UndefOr[`true`] = js.undefined
    
    var avx512dq: js.UndefOr[`true`] = js.undefined
    
    var avx512er: js.UndefOr[`true`] = js.undefined
    
    var avx512f: js.UndefOr[`true`] = js.undefined
    
    var avx512ifma: js.UndefOr[`true`] = js.undefined
    
    var avx512pf: js.UndefOr[`true`] = js.undefined
    
    var avx512vbmi: js.UndefOr[`true`] = js.undefined
    
    var avx512vbmi2: js.UndefOr[`true`] = js.undefined
    
    var avx512vl: js.UndefOr[`true`] = js.undefined
    
    var avx512vnni: js.UndefOr[`true`] = js.undefined
    
    var avx512vpopcntdq: js.UndefOr[`true`] = js.undefined
    
    var bmi1: js.UndefOr[`true`] = js.undefined
    
    var bmi2: js.UndefOr[`true`] = js.undefined
    
    var clflushopt: js.UndefOr[`true`] = js.undefined
    
    var clfsh: js.UndefOr[`true`] = js.undefined
    
    var clwb: js.UndefOr[`true`] = js.undefined
    
    /**
      * aka. CMPXCHG16B
      */
    var cx16: js.UndefOr[`true`] = js.undefined
    
    var cx8: js.UndefOr[`true`] = js.undefined
    
    var dca: js.UndefOr[`true`] = js.undefined
    
    var erms: js.UndefOr[`true`] = js.undefined
    
    var f16c: js.UndefOr[`true`] = js.undefined
    
    var fma3: js.UndefOr[`true`] = js.undefined
    
    var fma4: js.UndefOr[`true`] = js.undefined
    
    var fpu: js.UndefOr[`true`] = js.undefined
    
    var hle: js.UndefOr[`true`] = js.undefined
    
    var mmx: js.UndefOr[`true`] = js.undefined
    
    var movbe: js.UndefOr[`true`] = js.undefined
    
    var pclmulqdq: js.UndefOr[`true`] = js.undefined
    
    var popcnt: js.UndefOr[`true`] = js.undefined
    
    var rdrnd: js.UndefOr[`true`] = js.undefined
    
    var rdseed: js.UndefOr[`true`] = js.undefined
    
    var rtm: js.UndefOr[`true`] = js.undefined
    
    var sgx: js.UndefOr[`true`] = js.undefined
    
    var sha: js.UndefOr[`true`] = js.undefined
    
    var smx: js.UndefOr[`true`] = js.undefined
    
    var ss: js.UndefOr[`true`] = js.undefined
    
    var sse: js.UndefOr[`true`] = js.undefined
    
    var sse2: js.UndefOr[`true`] = js.undefined
    
    var sse3: js.UndefOr[`true`] = js.undefined
    
    var sse4_1: js.UndefOr[`true`] = js.undefined
    
    var sse4_2: js.UndefOr[`true`] = js.undefined
    
    var sse4a: js.UndefOr[`true`] = js.undefined
    
    var ssse3: js.UndefOr[`true`] = js.undefined
    
    var tsc: js.UndefOr[`true`] = js.undefined
    
    var vaes: js.UndefOr[`true`] = js.undefined
    
    var vpclmulqdq: js.UndefOr[`true`] = js.undefined
  }
  object X86CpuFlags {
    
    inline def apply(): X86CpuFlags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[X86CpuFlags]
    }
    
    extension [Self <: X86CpuFlags](x: Self) {
      
      inline def setAes(value: `true`): Self = StObject.set(x, "aes", value.asInstanceOf[js.Any])
      
      inline def setAesUndefined: Self = StObject.set(x, "aes", js.undefined)
      
      inline def setAmx_bf16(value: `true`): Self = StObject.set(x, "amx_bf16", value.asInstanceOf[js.Any])
      
      inline def setAmx_bf16Undefined: Self = StObject.set(x, "amx_bf16", js.undefined)
      
      inline def setAmx_int8(value: `true`): Self = StObject.set(x, "amx_int8", value.asInstanceOf[js.Any])
      
      inline def setAmx_int8Undefined: Self = StObject.set(x, "amx_int8", js.undefined)
      
      inline def setAmx_tile(value: `true`): Self = StObject.set(x, "amx_tile", value.asInstanceOf[js.Any])
      
      inline def setAmx_tileUndefined: Self = StObject.set(x, "amx_tile", js.undefined)
      
      inline def setAvx(value: `true`): Self = StObject.set(x, "avx", value.asInstanceOf[js.Any])
      
      inline def setAvx2(value: `true`): Self = StObject.set(x, "avx2", value.asInstanceOf[js.Any])
      
      inline def setAvx2Undefined: Self = StObject.set(x, "avx2", js.undefined)
      
      inline def setAvx512_4fmaps(value: `true`): Self = StObject.set(x, "avx512_4fmaps", value.asInstanceOf[js.Any])
      
      inline def setAvx512_4fmapsUndefined: Self = StObject.set(x, "avx512_4fmaps", js.undefined)
      
      inline def setAvx512_4vbmi2(value: `true`): Self = StObject.set(x, "avx512_4vbmi2", value.asInstanceOf[js.Any])
      
      inline def setAvx512_4vbmi2Undefined: Self = StObject.set(x, "avx512_4vbmi2", js.undefined)
      
      inline def setAvx512_4vnniw(value: `true`): Self = StObject.set(x, "avx512_4vnniw", value.asInstanceOf[js.Any])
      
      inline def setAvx512_4vnniwUndefined: Self = StObject.set(x, "avx512_4vnniw", js.undefined)
      
      inline def setAvx512_bf16(value: `true`): Self = StObject.set(x, "avx512_bf16", value.asInstanceOf[js.Any])
      
      inline def setAvx512_bf16Undefined: Self = StObject.set(x, "avx512_bf16", js.undefined)
      
      inline def setAvx512_second_fma(value: `true`): Self = StObject.set(x, "avx512_second_fma", value.asInstanceOf[js.Any])
      
      inline def setAvx512_second_fmaUndefined: Self = StObject.set(x, "avx512_second_fma", js.undefined)
      
      inline def setAvx512_vp2intersect(value: `true`): Self = StObject.set(x, "avx512_vp2intersect", value.asInstanceOf[js.Any])
      
      inline def setAvx512_vp2intersectUndefined: Self = StObject.set(x, "avx512_vp2intersect", js.undefined)
      
      inline def setAvx512bitalg(value: `true`): Self = StObject.set(x, "avx512bitalg", value.asInstanceOf[js.Any])
      
      inline def setAvx512bitalgUndefined: Self = StObject.set(x, "avx512bitalg", js.undefined)
      
      inline def setAvx512bw(value: `true`): Self = StObject.set(x, "avx512bw", value.asInstanceOf[js.Any])
      
      inline def setAvx512bwUndefined: Self = StObject.set(x, "avx512bw", js.undefined)
      
      inline def setAvx512cd(value: `true`): Self = StObject.set(x, "avx512cd", value.asInstanceOf[js.Any])
      
      inline def setAvx512cdUndefined: Self = StObject.set(x, "avx512cd", js.undefined)
      
      inline def setAvx512dq(value: `true`): Self = StObject.set(x, "avx512dq", value.asInstanceOf[js.Any])
      
      inline def setAvx512dqUndefined: Self = StObject.set(x, "avx512dq", js.undefined)
      
      inline def setAvx512er(value: `true`): Self = StObject.set(x, "avx512er", value.asInstanceOf[js.Any])
      
      inline def setAvx512erUndefined: Self = StObject.set(x, "avx512er", js.undefined)
      
      inline def setAvx512f(value: `true`): Self = StObject.set(x, "avx512f", value.asInstanceOf[js.Any])
      
      inline def setAvx512fUndefined: Self = StObject.set(x, "avx512f", js.undefined)
      
      inline def setAvx512ifma(value: `true`): Self = StObject.set(x, "avx512ifma", value.asInstanceOf[js.Any])
      
      inline def setAvx512ifmaUndefined: Self = StObject.set(x, "avx512ifma", js.undefined)
      
      inline def setAvx512pf(value: `true`): Self = StObject.set(x, "avx512pf", value.asInstanceOf[js.Any])
      
      inline def setAvx512pfUndefined: Self = StObject.set(x, "avx512pf", js.undefined)
      
      inline def setAvx512vbmi(value: `true`): Self = StObject.set(x, "avx512vbmi", value.asInstanceOf[js.Any])
      
      inline def setAvx512vbmi2(value: `true`): Self = StObject.set(x, "avx512vbmi2", value.asInstanceOf[js.Any])
      
      inline def setAvx512vbmi2Undefined: Self = StObject.set(x, "avx512vbmi2", js.undefined)
      
      inline def setAvx512vbmiUndefined: Self = StObject.set(x, "avx512vbmi", js.undefined)
      
      inline def setAvx512vl(value: `true`): Self = StObject.set(x, "avx512vl", value.asInstanceOf[js.Any])
      
      inline def setAvx512vlUndefined: Self = StObject.set(x, "avx512vl", js.undefined)
      
      inline def setAvx512vnni(value: `true`): Self = StObject.set(x, "avx512vnni", value.asInstanceOf[js.Any])
      
      inline def setAvx512vnniUndefined: Self = StObject.set(x, "avx512vnni", js.undefined)
      
      inline def setAvx512vpopcntdq(value: `true`): Self = StObject.set(x, "avx512vpopcntdq", value.asInstanceOf[js.Any])
      
      inline def setAvx512vpopcntdqUndefined: Self = StObject.set(x, "avx512vpopcntdq", js.undefined)
      
      inline def setAvxUndefined: Self = StObject.set(x, "avx", js.undefined)
      
      inline def setBmi1(value: `true`): Self = StObject.set(x, "bmi1", value.asInstanceOf[js.Any])
      
      inline def setBmi1Undefined: Self = StObject.set(x, "bmi1", js.undefined)
      
      inline def setBmi2(value: `true`): Self = StObject.set(x, "bmi2", value.asInstanceOf[js.Any])
      
      inline def setBmi2Undefined: Self = StObject.set(x, "bmi2", js.undefined)
      
      inline def setClflushopt(value: `true`): Self = StObject.set(x, "clflushopt", value.asInstanceOf[js.Any])
      
      inline def setClflushoptUndefined: Self = StObject.set(x, "clflushopt", js.undefined)
      
      inline def setClfsh(value: `true`): Self = StObject.set(x, "clfsh", value.asInstanceOf[js.Any])
      
      inline def setClfshUndefined: Self = StObject.set(x, "clfsh", js.undefined)
      
      inline def setClwb(value: `true`): Self = StObject.set(x, "clwb", value.asInstanceOf[js.Any])
      
      inline def setClwbUndefined: Self = StObject.set(x, "clwb", js.undefined)
      
      inline def setCx16(value: `true`): Self = StObject.set(x, "cx16", value.asInstanceOf[js.Any])
      
      inline def setCx16Undefined: Self = StObject.set(x, "cx16", js.undefined)
      
      inline def setCx8(value: `true`): Self = StObject.set(x, "cx8", value.asInstanceOf[js.Any])
      
      inline def setCx8Undefined: Self = StObject.set(x, "cx8", js.undefined)
      
      inline def setDca(value: `true`): Self = StObject.set(x, "dca", value.asInstanceOf[js.Any])
      
      inline def setDcaUndefined: Self = StObject.set(x, "dca", js.undefined)
      
      inline def setErms(value: `true`): Self = StObject.set(x, "erms", value.asInstanceOf[js.Any])
      
      inline def setErmsUndefined: Self = StObject.set(x, "erms", js.undefined)
      
      inline def setF16c(value: `true`): Self = StObject.set(x, "f16c", value.asInstanceOf[js.Any])
      
      inline def setF16cUndefined: Self = StObject.set(x, "f16c", js.undefined)
      
      inline def setFma3(value: `true`): Self = StObject.set(x, "fma3", value.asInstanceOf[js.Any])
      
      inline def setFma3Undefined: Self = StObject.set(x, "fma3", js.undefined)
      
      inline def setFma4(value: `true`): Self = StObject.set(x, "fma4", value.asInstanceOf[js.Any])
      
      inline def setFma4Undefined: Self = StObject.set(x, "fma4", js.undefined)
      
      inline def setFpu(value: `true`): Self = StObject.set(x, "fpu", value.asInstanceOf[js.Any])
      
      inline def setFpuUndefined: Self = StObject.set(x, "fpu", js.undefined)
      
      inline def setHle(value: `true`): Self = StObject.set(x, "hle", value.asInstanceOf[js.Any])
      
      inline def setHleUndefined: Self = StObject.set(x, "hle", js.undefined)
      
      inline def setMmx(value: `true`): Self = StObject.set(x, "mmx", value.asInstanceOf[js.Any])
      
      inline def setMmxUndefined: Self = StObject.set(x, "mmx", js.undefined)
      
      inline def setMovbe(value: `true`): Self = StObject.set(x, "movbe", value.asInstanceOf[js.Any])
      
      inline def setMovbeUndefined: Self = StObject.set(x, "movbe", js.undefined)
      
      inline def setPclmulqdq(value: `true`): Self = StObject.set(x, "pclmulqdq", value.asInstanceOf[js.Any])
      
      inline def setPclmulqdqUndefined: Self = StObject.set(x, "pclmulqdq", js.undefined)
      
      inline def setPopcnt(value: `true`): Self = StObject.set(x, "popcnt", value.asInstanceOf[js.Any])
      
      inline def setPopcntUndefined: Self = StObject.set(x, "popcnt", js.undefined)
      
      inline def setRdrnd(value: `true`): Self = StObject.set(x, "rdrnd", value.asInstanceOf[js.Any])
      
      inline def setRdrndUndefined: Self = StObject.set(x, "rdrnd", js.undefined)
      
      inline def setRdseed(value: `true`): Self = StObject.set(x, "rdseed", value.asInstanceOf[js.Any])
      
      inline def setRdseedUndefined: Self = StObject.set(x, "rdseed", js.undefined)
      
      inline def setRtm(value: `true`): Self = StObject.set(x, "rtm", value.asInstanceOf[js.Any])
      
      inline def setRtmUndefined: Self = StObject.set(x, "rtm", js.undefined)
      
      inline def setSgx(value: `true`): Self = StObject.set(x, "sgx", value.asInstanceOf[js.Any])
      
      inline def setSgxUndefined: Self = StObject.set(x, "sgx", js.undefined)
      
      inline def setSha(value: `true`): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
      
      inline def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
      
      inline def setSmx(value: `true`): Self = StObject.set(x, "smx", value.asInstanceOf[js.Any])
      
      inline def setSmxUndefined: Self = StObject.set(x, "smx", js.undefined)
      
      inline def setSs(value: `true`): Self = StObject.set(x, "ss", value.asInstanceOf[js.Any])
      
      inline def setSsUndefined: Self = StObject.set(x, "ss", js.undefined)
      
      inline def setSse(value: `true`): Self = StObject.set(x, "sse", value.asInstanceOf[js.Any])
      
      inline def setSse2(value: `true`): Self = StObject.set(x, "sse2", value.asInstanceOf[js.Any])
      
      inline def setSse2Undefined: Self = StObject.set(x, "sse2", js.undefined)
      
      inline def setSse3(value: `true`): Self = StObject.set(x, "sse3", value.asInstanceOf[js.Any])
      
      inline def setSse3Undefined: Self = StObject.set(x, "sse3", js.undefined)
      
      inline def setSse4_1(value: `true`): Self = StObject.set(x, "sse4_1", value.asInstanceOf[js.Any])
      
      inline def setSse4_1Undefined: Self = StObject.set(x, "sse4_1", js.undefined)
      
      inline def setSse4_2(value: `true`): Self = StObject.set(x, "sse4_2", value.asInstanceOf[js.Any])
      
      inline def setSse4_2Undefined: Self = StObject.set(x, "sse4_2", js.undefined)
      
      inline def setSse4a(value: `true`): Self = StObject.set(x, "sse4a", value.asInstanceOf[js.Any])
      
      inline def setSse4aUndefined: Self = StObject.set(x, "sse4a", js.undefined)
      
      inline def setSseUndefined: Self = StObject.set(x, "sse", js.undefined)
      
      inline def setSsse3(value: `true`): Self = StObject.set(x, "ssse3", value.asInstanceOf[js.Any])
      
      inline def setSsse3Undefined: Self = StObject.set(x, "ssse3", js.undefined)
      
      inline def setTsc(value: `true`): Self = StObject.set(x, "tsc", value.asInstanceOf[js.Any])
      
      inline def setTscUndefined: Self = StObject.set(x, "tsc", js.undefined)
      
      inline def setVaes(value: `true`): Self = StObject.set(x, "vaes", value.asInstanceOf[js.Any])
      
      inline def setVaesUndefined: Self = StObject.set(x, "vaes", js.undefined)
      
      inline def setVpclmulqdq(value: `true`): Self = StObject.set(x, "vpclmulqdq", value.asInstanceOf[js.Any])
      
      inline def setVpclmulqdqUndefined: Self = StObject.set(x, "vpclmulqdq", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cpuFeatures.cpuFeaturesStrings.X86_UNKNOWN
    - typings.cpuFeatures.cpuFeaturesStrings.INTEL_CORE
    - typings.cpuFeatures.cpuFeaturesStrings.INTEL_PNR
    - typings.cpuFeatures.cpuFeaturesStrings.INTEL_NHM
    - typings.cpuFeatures.cpuFeaturesStrings.INTEL_ATOM_BNL
    - typings.cpuFeatures.cpuFeaturesStrings.INTEL_WSM
    - typings.cpuFeatures.cpuFeaturesStrings.INTEL_SNB
    - typings.cpuFeatures.cpuFeaturesStrings.INTEL_IVB
    - typings.cpuFeatures.cpuFeaturesStrings.INTEL_ATOM_SMT
    - typings.cpuFeatures.cpuFeaturesStrings.INTEL_HSW
    - typings.cpuFeatures.cpuFeaturesStrings.INTEL_BDW
    - typings.cpuFeatures.cpuFeaturesStrings.INTEL_SKL
    - typings.cpuFeatures.cpuFeaturesStrings.INTEL_ATOM_GMT
    - typings.cpuFeatures.cpuFeaturesStrings.INTEL_KBL
    - typings.cpuFeatures.cpuFeaturesStrings.INTEL_CFL
    - typings.cpuFeatures.cpuFeaturesStrings.INTEL_WHL
    - typings.cpuFeatures.cpuFeaturesStrings.INTEL_CNL
    - typings.cpuFeatures.cpuFeaturesStrings.INTEL_ICL
    - typings.cpuFeatures.cpuFeaturesStrings.INTEL_TGL
    - typings.cpuFeatures.cpuFeaturesStrings.INTEL_SPR
    - typings.cpuFeatures.cpuFeaturesStrings.AMD_HAMMER
    - typings.cpuFeatures.cpuFeaturesStrings.AMD_K10
    - typings.cpuFeatures.cpuFeaturesStrings.AMD_K11
    - typings.cpuFeatures.cpuFeaturesStrings.AMD_K12
    - typings.cpuFeatures.cpuFeaturesStrings.AMD_BOBCAT
    - typings.cpuFeatures.cpuFeaturesStrings.AMD_PILEDRIVER
    - typings.cpuFeatures.cpuFeaturesStrings.AMD_STREAMROLLER
    - typings.cpuFeatures.cpuFeaturesStrings.AMD_EXCAVATOR
    - typings.cpuFeatures.cpuFeaturesStrings.AMD_BULLDOZER
    - typings.cpuFeatures.cpuFeaturesStrings.AMD_PUMA
    - typings.cpuFeatures.cpuFeaturesStrings.AMD_JAGUAR
    - typings.cpuFeatures.cpuFeaturesStrings.AMD_ZEN
    - typings.cpuFeatures.cpuFeaturesStrings.AMD_ZEN_PLUS
    - typings.cpuFeatures.cpuFeaturesStrings.AMD_ZEN2
    - typings.cpuFeatures.cpuFeaturesStrings.AMD_ZEN3
    - typings.cpuFeatures.cpuFeaturesStrings.`unknown microarchitecture`
  */
  trait X86UArch extends StObject
  object X86UArch {
    
    inline def AMD_BOBCAT: typings.cpuFeatures.cpuFeaturesStrings.AMD_BOBCAT = "AMD_BOBCAT".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.AMD_BOBCAT]
    
    inline def AMD_BULLDOZER: typings.cpuFeatures.cpuFeaturesStrings.AMD_BULLDOZER = "AMD_BULLDOZER".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.AMD_BULLDOZER]
    
    inline def AMD_EXCAVATOR: typings.cpuFeatures.cpuFeaturesStrings.AMD_EXCAVATOR = "AMD_EXCAVATOR".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.AMD_EXCAVATOR]
    
    inline def AMD_HAMMER: typings.cpuFeatures.cpuFeaturesStrings.AMD_HAMMER = "AMD_HAMMER".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.AMD_HAMMER]
    
    inline def AMD_JAGUAR: typings.cpuFeatures.cpuFeaturesStrings.AMD_JAGUAR = "AMD_JAGUAR".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.AMD_JAGUAR]
    
    inline def AMD_K10: typings.cpuFeatures.cpuFeaturesStrings.AMD_K10 = "AMD_K10".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.AMD_K10]
    
    inline def AMD_K11: typings.cpuFeatures.cpuFeaturesStrings.AMD_K11 = "AMD_K11".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.AMD_K11]
    
    inline def AMD_K12: typings.cpuFeatures.cpuFeaturesStrings.AMD_K12 = "AMD_K12".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.AMD_K12]
    
    inline def AMD_PILEDRIVER: typings.cpuFeatures.cpuFeaturesStrings.AMD_PILEDRIVER = "AMD_PILEDRIVER".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.AMD_PILEDRIVER]
    
    inline def AMD_PUMA: typings.cpuFeatures.cpuFeaturesStrings.AMD_PUMA = "AMD_PUMA".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.AMD_PUMA]
    
    inline def AMD_STREAMROLLER: typings.cpuFeatures.cpuFeaturesStrings.AMD_STREAMROLLER = "AMD_STREAMROLLER".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.AMD_STREAMROLLER]
    
    inline def AMD_ZEN: typings.cpuFeatures.cpuFeaturesStrings.AMD_ZEN = "AMD_ZEN".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.AMD_ZEN]
    
    inline def AMD_ZEN2: typings.cpuFeatures.cpuFeaturesStrings.AMD_ZEN2 = "AMD_ZEN2".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.AMD_ZEN2]
    
    inline def AMD_ZEN3: typings.cpuFeatures.cpuFeaturesStrings.AMD_ZEN3 = "AMD_ZEN3".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.AMD_ZEN3]
    
    inline def AMD_ZEN_PLUS: typings.cpuFeatures.cpuFeaturesStrings.AMD_ZEN_PLUS = "AMD_ZEN_PLUS".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.AMD_ZEN_PLUS]
    
    inline def INTEL_ATOM_BNL: typings.cpuFeatures.cpuFeaturesStrings.INTEL_ATOM_BNL = "INTEL_ATOM_BNL".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.INTEL_ATOM_BNL]
    
    inline def INTEL_ATOM_GMT: typings.cpuFeatures.cpuFeaturesStrings.INTEL_ATOM_GMT = "INTEL_ATOM_GMT".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.INTEL_ATOM_GMT]
    
    inline def INTEL_ATOM_SMT: typings.cpuFeatures.cpuFeaturesStrings.INTEL_ATOM_SMT = "INTEL_ATOM_SMT".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.INTEL_ATOM_SMT]
    
    inline def INTEL_BDW: typings.cpuFeatures.cpuFeaturesStrings.INTEL_BDW = "INTEL_BDW".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.INTEL_BDW]
    
    inline def INTEL_CFL: typings.cpuFeatures.cpuFeaturesStrings.INTEL_CFL = "INTEL_CFL".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.INTEL_CFL]
    
    inline def INTEL_CNL: typings.cpuFeatures.cpuFeaturesStrings.INTEL_CNL = "INTEL_CNL".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.INTEL_CNL]
    
    inline def INTEL_CORE: typings.cpuFeatures.cpuFeaturesStrings.INTEL_CORE = "INTEL_CORE".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.INTEL_CORE]
    
    inline def INTEL_HSW: typings.cpuFeatures.cpuFeaturesStrings.INTEL_HSW = "INTEL_HSW".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.INTEL_HSW]
    
    inline def INTEL_ICL: typings.cpuFeatures.cpuFeaturesStrings.INTEL_ICL = "INTEL_ICL".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.INTEL_ICL]
    
    inline def INTEL_IVB: typings.cpuFeatures.cpuFeaturesStrings.INTEL_IVB = "INTEL_IVB".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.INTEL_IVB]
    
    inline def INTEL_KBL: typings.cpuFeatures.cpuFeaturesStrings.INTEL_KBL = "INTEL_KBL".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.INTEL_KBL]
    
    inline def INTEL_NHM: typings.cpuFeatures.cpuFeaturesStrings.INTEL_NHM = "INTEL_NHM".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.INTEL_NHM]
    
    inline def INTEL_PNR: typings.cpuFeatures.cpuFeaturesStrings.INTEL_PNR = "INTEL_PNR".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.INTEL_PNR]
    
    inline def INTEL_SKL: typings.cpuFeatures.cpuFeaturesStrings.INTEL_SKL = "INTEL_SKL".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.INTEL_SKL]
    
    inline def INTEL_SNB: typings.cpuFeatures.cpuFeaturesStrings.INTEL_SNB = "INTEL_SNB".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.INTEL_SNB]
    
    inline def INTEL_SPR: typings.cpuFeatures.cpuFeaturesStrings.INTEL_SPR = "INTEL_SPR".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.INTEL_SPR]
    
    inline def INTEL_TGL: typings.cpuFeatures.cpuFeaturesStrings.INTEL_TGL = "INTEL_TGL".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.INTEL_TGL]
    
    inline def INTEL_WHL: typings.cpuFeatures.cpuFeaturesStrings.INTEL_WHL = "INTEL_WHL".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.INTEL_WHL]
    
    inline def INTEL_WSM: typings.cpuFeatures.cpuFeaturesStrings.INTEL_WSM = "INTEL_WSM".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.INTEL_WSM]
    
    inline def X86_UNKNOWN: typings.cpuFeatures.cpuFeaturesStrings.X86_UNKNOWN = "X86_UNKNOWN".asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.X86_UNKNOWN]
    
    inline def `unknown microarchitecture`: typings.cpuFeatures.cpuFeaturesStrings.`unknown microarchitecture` = ("unknown microarchitecture").asInstanceOf[typings.cpuFeatures.cpuFeaturesStrings.`unknown microarchitecture`]
  }
}
