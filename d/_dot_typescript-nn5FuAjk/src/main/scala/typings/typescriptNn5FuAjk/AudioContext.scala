package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An audio-processing graph built from audio modules linked together, each represented by an AudioNode. */
@js.native
trait AudioContext
  extends StObject
     with BaseAudioContext {
  
  val baseLatency: Double = js.native
  
  def close(): Promise[Unit] = js.native
  
  def createMediaElementSource(mediaElement: HTMLMediaElement): MediaElementAudioSourceNode = js.native
  
  def createMediaStreamDestination(): MediaStreamAudioDestinationNode = js.native
  
  def createMediaStreamSource(mediaStream: MediaStream): MediaStreamAudioSourceNode = js.native
  
  def getOutputTimestamp(): AudioTimestamp = js.native
  
  def resume(): Promise[Unit] = js.native
  
  def suspend(): Promise[Unit] = js.native
}
