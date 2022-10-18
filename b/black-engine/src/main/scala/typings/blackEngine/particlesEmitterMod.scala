package typings.blackEngine

import typings.blackEngine.coreGameObjectMod.GameObject
import typings.blackEngine.displayDisplayObjectMod.DisplayObject
import typings.blackEngine.particlesModifierMod.Modifier
import typings.blackEngine.scattersFloatScatterMod.FloatScatter
import typings.blackEngine.texturesTextureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particlesEmitterMod {
  
  @JSImport("black-engine/particles/Emitter", "Emitter")
  @js.native
  open class Emitter () extends DisplayObject {
    
    /* private */ var __create: Any = js.native
    
    def __getTime(): Any = js.native
    
    /* private */ var __tmpLocal: Any = js.native
    
    /* private */ var __tmpWorld: Any = js.native
    
    def addModifier(modifier: Modifier): Modifier = js.native
    
    def emitCount: FloatScatter = js.native
    def emitCount_=(arg: FloatScatter): Unit = js.native
    
    def emitDelay: FloatScatter = js.native
    def emitDelay_=(arg: FloatScatter): Unit = js.native
    
    def emitDuration: FloatScatter = js.native
    def emitDuration_=(arg: FloatScatter): Unit = js.native
    
    def emitInterval: FloatScatter = js.native
    def emitInterval_=(arg: FloatScatter): Unit = js.native
    
    def emitNumRepeats: FloatScatter = js.native
    def emitNumRepeats_=(arg: FloatScatter): Unit = js.native
    
    /* private */ var mActions: Any = js.native
    
    /* private */ var mCurrentPresimulationTime: Any = js.native
    
    /* private */ var mEmitCount: Any = js.native
    
    /* private */ var mEmitDelay: Any = js.native
    
    /* private */ var mEmitDelayLeft: Any = js.native
    
    /* private */ var mEmitDuration: Any = js.native
    
    /* private */ var mEmitDurationLeft: Any = js.native
    
    /* private */ var mEmitInterval: Any = js.native
    
    /* private */ var mEmitIntervalLeft: Any = js.native
    
    /* private */ var mEmitNumRepeats: Any = js.native
    
    /* private */ var mEmitNumRepeatsLeft: Any = js.native
    
    /* private */ var mInitializers: Any = js.native
    
    /* private */ var mIsLocal: Any = js.native
    
    /* private */ var mMaxParticles: Any = js.native
    
    /* private */ var mNextUpdateAt: Any = js.native
    
    /* private */ var mParticles: Any = js.native
    
    /* private */ var mPresimulateSeconds: Any = js.native
    
    /* private */ var mRecycled: Any = js.native
    
    /* private */ var mSortOrder: Any = js.native
    
    /* private */ var mSpace: Any = js.native
    
    /* private */ var mState: Any = js.native
    
    /* private */ var mTextureNames: Any = js.native
    
    /* private */ var mTextures: Any = js.native
    
    def maxParticles: Double = js.native
    def maxParticles_=(arg: Double): Unit = js.native
    
    def pause(): Unit = js.native
    
    def play(): Unit = js.native
    
    def removeModifier(modifier: Modifier): Boolean = js.native
    
    def simulate(time: Double): Unit = js.native
    
    def sortOrder: String = js.native
    def sortOrder_=(arg: String): Unit = js.native
    
    def space: GameObject = js.native
    def space_=(arg: GameObject): Unit = js.native
    
    def state: Double = js.native
    
    def stop(): Unit = js.native
    
    def textureNames: js.Array[String] = js.native
    def textureNames_=(arg: js.Array[String]): Unit = js.native
    
    def textures: js.Array[Texture] = js.native
    def textures_=(arg: js.Array[Texture]): Unit = js.native
    
    /* private */ var updateNextTick: Any = js.native
  }
}
